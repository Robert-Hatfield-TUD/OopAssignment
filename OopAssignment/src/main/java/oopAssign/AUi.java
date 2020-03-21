package oopAssign;


import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;


public class AUi extends JFrame implements ActionListener, MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel topLabel1, Explab, Cval, CVlink;
	JButton t25, t50, t75, leave;
	JPanel centrePanel1, southPanel1, northPanel1, westPanel1, eastPanel1;
	JTextField f1Temp, f2Ach, f3Cou, f4ST, f5DZ;
	String myTitle = "Project Oop";
	JCheckBox c1;
	public int perc = 25;
	public int perc1 = 50;
	public int perc2 = 75;
	
	public AUi(String myTitle) {
		
		super(myTitle);
		setSize(900, 600);
		BorderLayout bl1 = new BorderLayout();
		setLayout(bl1);
		
		topLabel1 = new JLabel ("Corona Virus Test");
		Explab = new JLabel ("(DZ) = Danger Zone\n");
		Cval = new JLabel ("");
		CVlink = new JLabel("\nClick me for full statistics");
		
		
		t25 = new JButton("Test 25%");
		t50 = new JButton("Test 50%");
		t75 = new JButton("Test 75%");
		leave = new JButton("Exit program");
		f1Temp = new JTextField("Temp", 10);
		f1Temp.setToolTipText("Enter Temperature type");
		f2Ach = new JTextField("Aches", 10);
		f2Ach.setToolTipText("Yes/no");
		f3Cou = new JTextField("Cough", 10);
		f3Cou.setToolTipText("Yes/no");
		f4ST = new JTextField("Sore Throat", 10);
		f4ST.setToolTipText("Yes/no");
		f5DZ = new JTextField("Recently in 'DZ'", 10);
		f5DZ.setToolTipText("Yes/no");
		
		//attatch the listener to the button
		t25.addActionListener(this);
		t50.addActionListener(this);
		t75.addActionListener(this);
		leave.addActionListener(this);
		f1Temp.addActionListener(this);
		Explab.addMouseListener(this);
		CVlink.addMouseListener(this);
		
		
		
		
		//setting up panels
		
		centrePanel1 = new JPanel();
		southPanel1 = new JPanel();
		northPanel1 = new JPanel();
		westPanel1 = new JPanel();
		eastPanel1 = new JPanel();
		
		
		southPanel1.add(t25);
		southPanel1.add(t50);
		southPanel1.add(t75);
		southPanel1.add(leave);
		northPanel1.add(topLabel1);
		centrePanel1.add(f1Temp);
		centrePanel1.add(f2Ach);
		centrePanel1.add(f3Cou);
		centrePanel1.add(f4ST);
		centrePanel1.add(f5DZ);
		westPanel1.add(Explab);
		eastPanel1.add(Cval);
		eastPanel1.add(CVlink);
		
		westPanel1.setSize(50, 200);
		
		
		add(centrePanel1, BorderLayout.CENTER);
		
		add(southPanel1, BorderLayout.SOUTH);
		
		add(northPanel1, BorderLayout.NORTH);
		
		add(westPanel1, BorderLayout.WEST);
		
		add(eastPanel1, BorderLayout.EAST);
		
		
		
		setVisible(true);
		
	}

	public void mouseClicked(MouseEvent e1) {
		// TODO Auto-generated method stub
		
		if(e1.getSource()==Explab)
		{
			JOptionPane.showMessageDialog(this,  "Danger zones include: \n"
					+ "China \n"
					+ "Italy \n"
					+ "Spain\n"
					+ "USA\n"
					+ "Germany\n"
					+ "Iran\n"
					+ "France\n"
					+ "S.Korea\n"
					+ "Switzerland\n"
					+ "UK\n"
					+ "Please visit https://www.worldometers.info/coronavirus/ For full statistics or click the text to the right of the screen.");
		}
		
		else if(e1.getSource()==CVlink)
		{
			try {
		         
		        Desktop.getDesktop().browse(new URI("https://www.worldometers.info/coronavirus/"));
		         
		    } catch (IOException | URISyntaxException e11) {
		        e11.printStackTrace();
		    }
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e2) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent myEvent) {
		// TODO Auto-generated method stub
		
		
		if(myEvent.getSource()==t75)
		{
			JOptionPane.showMessageDialog(this, "You are more likely to get the Corona Virus with a chance of: "+perc2+"%");
		}
		
		else if(myEvent.getSource()==t50)
		{
			JOptionPane.showMessageDialog(this, "Your chances of getting the Corona Virus are even with a chance of: "+perc1+"%");
		}
		
		else if(myEvent.getSource()==t25)
		{
			JOptionPane.showMessageDialog(this, "You are less likely to get the Corona Virus with a chance of: "+perc+"%");
		}
		
		else if(myEvent.getSource()==leave)
		{
			JOptionPane.showMessageDialog(this, "Thank you for using the program");
			System.exit(0);
		}
	}
	
}

