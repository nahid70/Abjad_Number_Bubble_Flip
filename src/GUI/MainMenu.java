package GUI;
/**
 * A simple program of GUI.  
 * @author Nahid Ahmadi
 * Date June 3, 2013.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame implements ActionListener
{
	private JPanel southP, northP;
	private JButton btnExit;
	private JButton buttons[];
	private String names[] = { "Abjad", "Number", "Bubble", "Flip" };
	private ImageIcon image;
	private JLabel lbl;

	public MainMenu() 
	{
		setTitle("main menu");
		
		image = new ImageIcon(getClass().getResource("b.jpg"));
		lbl = new JLabel(image);
		add(lbl);

		northP = new JPanel();
		buttons = new JButton[names.length];
		for (int i = 0; i < names.length; i++) 
		{
			buttons[i] = new JButton(names[i]);
			buttons[i].addActionListener(this);
			northP.add(buttons[i]);
		}
		northP.setBackground(new Color(7, 4, 34));
		add(northP, BorderLayout.NORTH);
		
		southP = new JPanel();
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		southP.setBackground(new Color(7, 4, 34));
		southP.add(btnExit);
		add(southP, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(316, 296);
		setLocationRelativeTo(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		if (label.equals("Abjad")) {
			dispose();
			new ConvertFarsiToAbjad();
		} 
		if (label.equals("Number")) {
			dispose();
			new FarsiNumber();
		} 
		if (label.equals("Bubble")) {
			dispose();
			new Bubble();
		} 
		if (label.equals("Flip")) {
			dispose();
			new Flip();
		} 
		if (label.equals("Exit"))
			System.exit(0);
	}
	
	public static void main(String[] args) {
		new MainMenu();
	}
}