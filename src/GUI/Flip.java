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

public class Flip extends JFrame implements ActionListener, KeyListener 
{
	private JLabel lblE_N, lblF_N;
	private JTextField txtOutput, txtInput;
	private JButton btnBack;
	private JPanel panelSouth, panelNorth;
	private ImageIcon image;
	private JLabel lbl;

	public Flip() 
	{
		setTitle("Flip frame");

		image = new ImageIcon(getClass().getResource("b.jpg"));
		lbl = new JLabel(image);
		add(lbl);

		panelNorth = new JPanel();
		panelNorth.setBackground(new Color(7, 4, 34));
		panelNorth.setLayout(new GridLayout(2, 2, 0, 2));

		lblE_N = new JLabel("Enter");
		lblE_N.setForeground(Color.white);
		lblE_N.setToolTipText("Enter letters to convert in Flip :");
		lblF_N = new JLabel("Flip");
		lblF_N.setForeground(Color.white);
		lblF_N.setToolTipText("the Flip of the letters is :");

		txtOutput = new JTextField();
		txtInput = new JTextField();
		txtInput.addKeyListener(this);

		panelSouth = new JPanel();
		panelSouth.setLayout(new BorderLayout());

		btnBack = new JButton("return to main menu");
		btnBack.addActionListener(this);

		panelNorth.add(lblE_N);
		panelNorth.add(txtInput);
		panelNorth.add(lblF_N);
		panelNorth.add(txtOutput);
		panelSouth.add(btnBack);
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
			String change = input.replace('a', 'ɐ').replace('b', 'q')
					.replace('c', 'ɔ').replace('d', 'p').replace('e', 'ǝ')
					.replace('f', 'ɟ').replace('g', 'ƃ').replace('h', 'ɥ')
					.replace('i', 'ı').replace('j', 'ɾ').replace('k', 'ʞ')
					.replace('l', 'ן').replace('m', 'ɯ').replace('n', 'u')
					.replace('p', 'd').replace('q', 'b').replace('r', 'ɹ')
					.replace('t', 'ʇ').replace('u', 'n').replace('v', 'ʌ')
					.replace('w', 'M').replace('x', 'x').replace('y', 'ʎ')
					.replace('z', 'z').replace('B', 'ᗺ').replace('C', 'Ↄ')
					.replace('D', 'ᗡ').replace('E', 'Ǝ').replace('F', 'Ⅎ')
					.replace('G', '⅁').replace('H', 'H').replace('I', 'I')
					.replace('J', 'ſ').replace('K', 'ʞ').replace('L', '⅂')
					.replace('M', 'W').replace('N', 'ᴎ').replace('O', 'O')
					.replace('P', 'd').replace('Q', 'ઠ').replace('R', 'ᴚ')
					.replace('S', 'S').replace('T', '⊥').replace('U', '∩')
					.replace('V', 'ᴧ').replace('W', 'M').replace('X', 'X')
					.replace('Y', '⅄').replace('Z', 'Z').replace('q', 'b');
			txtOutput.setText(change);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
}