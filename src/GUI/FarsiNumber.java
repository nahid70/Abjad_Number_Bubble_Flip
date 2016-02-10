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

public class FarsiNumber extends JFrame implements ActionListener, KeyListener 
{
	private JLabel lblE_N, lblF_N;
	private JTextField txtOutput, txtInput;
	private JButton btnBack;
	private JPanel panelSouth, panelNorth;
	private ImageIcon image;
	private JLabel lbl;

	public FarsiNumber() 
	{
		setTitle("Farsi frame");
		
		image = new ImageIcon(getClass().getResource("b.jpg"));
		lbl = new JLabel(image);
		add(lbl);
		
		panelNorth = new JPanel();
		panelNorth.setBackground(new Color(7, 4, 34));
		panelNorth.setLayout(new GridLayout(2, 2, 0, 2));
		
		lblE_N = new JLabel("English");
		lblE_N.setForeground(Color.white);
		lblE_N.setToolTipText("Enter english number :");
		lblF_N = new JLabel("Persion");
		lblF_N.setForeground(Color.white);
		lblF_N.setToolTipText("the persion of the number is :");
		
		txtOutput = new JTextField();
		txtInput = new JTextField();
		txtInput.addKeyListener(this);
		
		panelSouth = new JPanel();
		panelSouth.setLayout(new BorderLayout());
		
		btnBack = new JButton("return to main menu");
		btnBack.addActionListener(this);
		
		panelSouth.add(btnBack);
		panelNorth.add(lblE_N);
		panelNorth.add(txtInput);
		panelNorth.add(lblF_N);
		panelNorth.add(txtOutput);
		add(panelNorth, BorderLayout.NORTH);
		add(panelSouth, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocation(450, 200);
		setSize(316, 292);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == btnBack) 
		{
			dispose();
			new MainMenu();
		}
	}
	public void keyPressed(KeyEvent arg0) {
	}

	public void keyReleased(KeyEvent e) 
	{
		if (e.getSource() == txtInput) 
		{
			String input = txtInput.getText();
			String change = input.replace('a', '٠').replace('1', '١')
					.replace('2', '۲').replace('3', '۳').replace('4', '۴')
					.replace('5', '۵').replace('6', '۶').replace('7', '۷')
					.replace('8', '۸').replace('9', '۹');
			txtOutput.setText(change);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
}