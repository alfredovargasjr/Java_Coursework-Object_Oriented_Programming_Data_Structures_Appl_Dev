package NotationConversion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Insets;

public class conversion extends JFrame {

	public JPanel contentPane;
	public JLabel labelResult;
	public int whichConversion;
	private JTextField textField;
	private String FINALinput;
	private String FINALresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversion frame = new conversion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public conversion() {
		setTitle("Conversion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inputField input = new inputField();
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 200, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/**
		 * buttons 9 - 0
		 */
		JButton Button9 = new JButton("9");
		Button9.setMargin(new Insets(0, 0, 0, 0));
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Button9.setBounds(109, 68, 38, 38);
		Button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.add("9");
				textField.setText(input.get());
			}
			
		});
		contentPane.add(Button9);
		
		JButton Button8 = new JButton("8");
		Button8.setMargin(new Insets(0, 0, 0, 0));
		Button8.setBounds(157, 68, 38, 38);
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("8");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button8);
		
		JButton Button7 = new JButton("7");
		Button7.setMargin(new Insets(0, 0, 0, 0));
		Button7.setBounds(205, 68, 38, 38);
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("7");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button7);
		
		JButton Button6 = new JButton("6");
		Button6.setMargin(new Insets(0, 0, 0, 0));
		Button6.setBounds(110, 117, 38, 38);
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("6");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button6);
		
		JButton Button5 = new JButton("5");
		Button5.setMargin(new Insets(0, 0, 0, 0));
		Button5.setBounds(157, 117, 38, 38);
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("5");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button5);
		
		JButton Button4 = new JButton("4");
		Button4.setMargin(new Insets(0, 0, 0, 0));
		Button4.setBounds(205, 117, 38, 38);
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("4");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button4);
		
		JButton Button3 = new JButton("3");
		Button3.setMargin(new Insets(0, 0, 0, 0));
		Button3.setBounds(110, 166, 38, 38);
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("3");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button3);
		
		JButton Button2 = new JButton("2");
		Button2.setMargin(new Insets(0, 0, 0, 0));
		Button2.setBounds(157, 166, 38, 38);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("2");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button2);
		
		JButton Button1 = new JButton("1");
		Button1.setMargin(new Insets(0, 0, 0, 0));
		Button1.setBounds(205, 166, 38, 38);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("1");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button1);
		
		JButton Button0 = new JButton("0");
		Button0.setMargin(new Insets(0, 0, 0, 0));
		Button0.setBounds(157, 212, 38, 38);
		Button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add("0");
				textField.setText(input.get());
			}
		});
		contentPane.add(Button0);
		
		/**
		 * delete the last inputed value
		 */
		JButton ButtonDelete = new JButton("Del");
		ButtonDelete.setHorizontalTextPosition(SwingConstants.CENTER);
		ButtonDelete.setBounds(353, 67, 53, 40);
		ButtonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.delete();
				textField.setText(input.get());
			}
		});
		contentPane.add(ButtonDelete);

		/**
		 * enter the input value, makes the string final
		 */
		JButton ButtonEnter = new JButton("Enter");
		ButtonEnter.setMargin(new Insets(0, 0, 0, 0));
		ButtonEnter.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ButtonEnter.setBounds(353, 161, 53, 89);
		ButtonEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				FINALinput = input.get();
			}
		});
		contentPane.add(ButtonEnter);
		
		/**
		 * convert the input to postfix or prefix
		 */
		JButton ButtonConvert = new JButton("Convert");
		ButtonConvert.setBounds(10, 141, 89, 38);
		ButtonConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(FINALinput != "" && input.get() != ""){
					solvePostFix converted = new solvePostFix(input.get(), whichConversion);
					FINALresult = converted.getResult();
					labelResult.setText(FINALresult);
				}
			}
			
		});
		contentPane.add(ButtonConvert);
		
		/**
		 * currency combobox
		 */
		JComboBox comboBoxCurrencies = new JComboBox();
		comboBoxCurrencies.setModel(new DefaultComboBoxModel(new String[] {"Currencies", "*", "/", "+", "-", "%", "^"}));
		comboBoxCurrencies.setMaximumRowCount(7);
		comboBoxCurrencies.setBounds(253, 68, 89, 20);
		comboBoxCurrencies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.add(comboBoxCurrencies.getSelectedItem().toString());
				textField.setText(input.get());
				comboBoxCurrencies.setSelectedIndex(0);
			}
		});
		contentPane.add(comboBoxCurrencies);
		
		/**
		 * display the result of the conversion via a label
		 */
		labelResult = new JLabel("");
		labelResult.setHorizontalAlignment(SwingConstants.CENTER);
		labelResult.setForeground(Color.black);
		labelResult.setBounds(220, 11, 186, 33);
		labelResult.setOpaque(true);
		labelResult.setBackground(new Color(204, 255, 204));
		labelResult.setText(FINALresult);
		contentPane.add(labelResult);
		
		/**
		 * combobox to choose between prefix or postfix
		 */
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Entered As...", "PostFix", "PreFix"}));
		comboBox.setBounds(10, 68, 89, 20);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				whichConversion = comboBox.getSelectedIndex();
				System.out.println(whichConversion);
			}
		});
		contentPane.add(comboBox);
		
		/**
		 * button to clear the input
		 */
		JButton ButtonClear = new JButton("Clear");
		ButtonClear.setMargin(new Insets(0, 0, 0, 0));
		ButtonClear.setHorizontalTextPosition(SwingConstants.CENTER);
		ButtonClear.setBounds(353, 115, 53, 40);
		ButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.clear();
				textField.setText(input.get());
			}
		});
		contentPane.add(ButtonClear);
		
	}
}
