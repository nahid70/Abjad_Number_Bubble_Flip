package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertFarsiToAbjad extends JFrame implements ActionListener 
{
	private JLabel lblInput, lblOutputK, lblOutputV;
	private JTextField txtInput1, txtOutputV, txtOutputK;
	private JButton btnEnter, btnBack;
	private JPanel panelSouth, panelNorth;
	private ImageIcon image;
	private JLabel lbl;

	public ConvertFarsiToAbjad()
	{
		setTitle("Abjad frame");
		
		image = new ImageIcon(getClass().getResource("b.jpg"));
		lbl = new JLabel(image);
		add(lbl);
		
		panelNorth = new JPanel();
		panelNorth.setBackground(new Color(7, 4, 34));
		panelNorth.setLayout(new GridLayout(3, 3, 9, 2));

		lblInput = new JLabel("Name");
		lblInput.setForeground(Color.white);
		lblInput.setToolTipText("Enter Farsi name to convert in Abjad :");
		lblOutputK = new JLabel("abjad kabir");
		lblOutputK.setForeground(Color.white);
		lblOutputK.setToolTipText("Abjad Kabir of the name is :");
		lblOutputV = new JLabel("abjad vasit");
		lblOutputV.setForeground(Color.white);
		lblOutputV.setToolTipText("Abjad vasit of the name is :");
		
		txtInput1 = new JTextField();
		txtInput1.setHorizontalAlignment(JTextField.CENTER);
		txtOutputV = new JTextField();
		txtOutputK = new JTextField();

		panelSouth = new JPanel();
		panelSouth.setBackground(new Color(7, 4, 34));
		panelSouth.setLayout(new FlowLayout());
		
		btnEnter = new JButton("Enter");
		btnEnter.addActionListener(this);
		btnBack = new JButton("return to main menu");
		btnBack.addActionListener(this);

		panelNorth.add(lblInput);
		panelNorth.add(txtInput1);
		panelNorth.add(lblOutputV);
		panelNorth.add(txtOutputV);
		panelNorth.add(lblOutputK);
		panelNorth.add(txtOutputK);
		add(panelNorth, BorderLayout.NORTH);
		panelSouth.add(btnEnter);
		panelSouth.add(btnBack);
		add(panelSouth, BorderLayout.SOUTH);
	
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocation(450, 200);
		setSize(316, 324);
		setVisible(true);
}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == btnEnter)
		{
			int sumK_A = 0;
			int sumV_A = 0;
			String inputStr = txtInput1.getText();
			for (int i = 0; i < inputStr.length(); i++)
			{
				sumK_A += Integer.parseInt(abjadKabir(inputStr.charAt(i)));
				sumV_A += Integer.parseInt(abjadVasit(inputStr.charAt(i)));
			}
			txtOutputK.setText("" + sumK_A);
			txtOutputV.setText("" + sumV_A);
		} 
		if (e.getSource() == btnBack)
		{
			dispose();
			new MainMenu();
		}
		txtInput1.getInputContext().selectInputMethod(new Locale("fa", "IR"));
	}
	
	public static String abjadKabir(char abjad) 
	{
		String abjad_help = Character.toString(abjad);
		String input = abjad_help.replaceAll("ا", "1").replaceAll("آ", "1")
				.replaceAll("ب", "2").replaceAll("پ", "2").replaceAll("ج", "3")
				.replaceAll("چ", "3").replaceAll("د", "4").replaceAll("ه", "5")
				.replaceAll("و", "6").replaceAll(" ", "0").replaceAll("ز", "7")
				.replaceAll("ژ", "7").replaceAll("ح", "8").replaceAll("ط", "9")
				.replaceAll("ی", "10").replaceAll("ي", "10")
				.replaceAll("ک", "20").replaceAll("گ", "20")
				.replaceAll("ل", "30").replaceAll("م", "40")
				.replaceAll("ن", "50").replaceAll("س", "60")
				.replaceAll("ع", "70").replaceAll("ف", "80")
				.replaceAll("ص", "90").replaceAll("ق", "100")
				.replaceAll("ر", "200").replaceAll("ش", "300")
				.replaceAll("ت", "400").replaceAll("ث", "500")
				.replaceAll("خ", "600").replaceAll("ذ", "700")
				.replaceAll("ض", "800").replaceAll("ظ", "900")
				.replaceAll("غ", "1000");
		return input;
	}

	public static String abjadVasit(char abjad)
	{
		String abjad_help = Character.toString(abjad);
		String input = abjad_help.replaceAll("ا", "1").replaceAll("آ", "1")
				.replaceAll("ب", "2").replaceAll("پ", "2").replaceAll("ج", "3")
				.replaceAll("چ", "3").replaceAll("د", "4").replaceAll("ه", "5")
				.replaceAll("و", "6").replaceAll(" ", "0").replaceAll("ز", "7")
				.replaceAll("ژ", "7").replaceAll("ح", "8").replaceAll("ط", "9")
				.replaceAll("ی", "10").replaceAll("ي", "10")
				.replaceAll("ک", "11").replaceAll("گ", "11")
				.replaceAll("ل", "12").replaceAll("م", "13")
				.replaceAll("ن", "14").replaceAll("س", "15")
				.replaceAll("ع", "16").replaceAll("ف", "17")
				.replaceAll("ص", "18").replaceAll("ق", "19")
				.replaceAll("ر", "20").replaceAll("ش", "21")
				.replaceAll("ت", "22").replaceAll("ث", "23")
				.replaceAll("خ", "24").replaceAll("ذ", "25")
				.replaceAll("ض", "26").replaceAll("ظ", "27")
				.replaceAll("غ", "28");
		return input;
	}
}