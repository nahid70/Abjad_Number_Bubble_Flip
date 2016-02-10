package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class Bubble extends JFrame implements ActionListener, KeyListener
{
	private JLabel lblE_N, lblF_N;
	private JTextField txtOutput, txtInput;
	private JButton btnBack;
	private JPanel panelSouth, panelNorth;
	private ImageIcon image;
	private JLabel lbl;

	public Bubble()
	{
		setTitle("Bubble frame");

		image = new ImageIcon(getClass().getResource("b.jpg"));
		lbl = new JLabel(image);
		add(lbl);

		panelNorth = new JPanel();
		panelNorth.setBackground(new Color(7, 4, 34));
		panelNorth.setLayout(new GridLayout(2, 2, 9, 2));

		lblE_N = new JLabel("Enter");
		lblE_N.setForeground(Color.white);
		lblE_N.setToolTipText("Enter letter or number to convert in Bubble :");
		lblF_N = new JLabel("Bubble");
		lblF_N.setForeground(Color.white);
		lblF_N.setToolTipText("the Bubble of the letter or numbers is :");

		txtOutput = new JTextField();
		txtInput = new JTextField();
		txtInput.addKeyListener(this);

		panelSouth = new JPanel();
		panelSouth.setLayout(new BorderLayout());

		btnBack = new JButton("return to main menu");
		btnBack.addActionListener(this);

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocation(450, 200);
		setSize(316, 292);
		setVisible(true);

		panelNorth.add(lblE_N);
		panelNorth.add(txtInput);
		panelNorth.add(lblF_N);
		panelNorth.add(txtOutput);
		panelSouth.add(btnBack);
		add(panelNorth, BorderLayout.NORTH);
		add(panelSouth, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == btnBack) 
		{
			dispose();
			new MainMenu();
		}
	}
	public void keyPressed(KeyEvent e) {
	}
	
	public void keyReleased(KeyEvent e) 
	{
		if (e.getSource() == txtInput) 
		{
			String input = txtInput.getText();
			String change = input.replace('1', '➀').replace('2', '➁')
					.replace('3', '➂').replace('4', '➃').replace('5', '➄')
					.replace('6', '➅').replace('7', '➆').replace('8', '➇')
					.replace('9', '➈').replace('a', 'ⓐ').replace('b', 'ⓑ')
					.replace('c', 'ⓒ').replace('d', 'ⓓ').replace('e', 'ⓔ')
					.replace('f', 'ⓕ').replace('g', 'ⓖ').replace('h', 'ⓗ')
					.replace('i', 'ⓘ').replace('j', 'ⓙ').replace('k', 'ⓚ')
					.replace('l', 'ⓛ').replace('m', 'ⓜ').replace('n', 'ⓝ')
					.replace('o', 'ⓞ').replace('p', 'ⓟ').replace('q', 'ⓠ')
					.replace('r', 'ⓡ').replace('s', 'ⓢ').replace('t', 'ⓣ')
					.replace('u', 'ⓤ').replace('v', 'ⓥ').replace('w', 'ⓦ')
					.replace('x', 'ⓧ').replace('y', 'ⓨ').replace('z', 'ⓩ')
					.replace('A', 'Ⓐ').replace('B', 'Ⓑ').replace('C', 'Ⓒ')
					.replace('D', 'Ⓓ').replace('E', 'Ⓔ').replace('F', 'Ⓕ')
					.replace('G', 'Ⓖ').replace('H', 'Ⓗ').replace('I', 'Ⓘ')
					.replace('J', 'Ⓙ').replace('K', 'Ⓚ').replace('L', 'Ⓛ')
					.replace('M', 'Ⓜ').replace('N', 'Ⓝ').replace('O', 'Ⓞ')
					.replace('P', 'Ⓟ').replace('Q', 'Ⓠ').replace('R', 'Ⓡ')
					.replace('S', 'Ⓢ').replace('T', 'Ⓣ').replace('U', 'Ⓤ')
					.replace('V', 'Ⓥ').replace('W', 'Ⓦ').replace('X', 'Ⓧ')
					.replace('Y', 'Ⓨ').replace('Z', 'Ⓩ');
			txtOutput.setText(change);
		} 
		if (e.getSource() == btnBack)
		{
			dispose();
			new MainMenu();
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
}