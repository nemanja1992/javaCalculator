import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Design {

	private JFrame frmCalculator;
	private JTextField textField;

	double firstnum;
	double secnum;
	double res;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design window = new Design();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setForeground(Color.CYAN);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 279, 394);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 243, 44);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bti_backspace = new JButton("\u2190");
		bti_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace= null;
				
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		bti_backspace.setFont(new Font("Times New Roman", Font.BOLD, 20));
		bti_backspace.setBounds(10, 66, 59, 51);
		frmCalculator.getContentPane().add(bti_backspace);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnC.setBounds(71, 66, 59, 51);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPercent.setBounds(132, 66, 59, 51);
		frmCalculator.getContentPane().add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPlus.setBounds(194, 66, 59, 51);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn7.setBounds(10, 121, 59, 51);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn8.setBounds(71, 121, 59, 51);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn9.setBounds(132, 121, 59, 51);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMinus.setBounds(194, 121, 59, 51);
		frmCalculator.getContentPane().add(btnMinus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn4.setBounds(10, 175, 59, 51);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn5.setBounds(71, 175, 59, 51);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn6.setBounds(132, 175, 59, 51);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiplication.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMultiplication.setBounds(194, 175, 59, 51);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn1.setBounds(10, 230, 59, 51);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn2.setBounds(71, 230, 59, 51);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn3.setBounds(132, 230, 59, 51);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivision.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDivision.setBounds(194, 230, 59, 51);
		frmCalculator.getContentPane().add(btnDivision);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn0.setBounds(10, 285, 59, 51);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDecimal.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDecimal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDecimal.setBounds(71, 285, 59, 51);
		frmCalculator.getContentPane().add(btnDecimal);
		
		JButton btnPlusMinus = new JButton("+-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPlusMinus.setBounds(132, 285, 59, 51);
		frmCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secnum=Double.parseDouble(textField.getText());
				
				if(operation == "+") {
					res = firstnum + secnum;
					answer = String.format("%.2f", res); 
					textField.setText(answer);
					
				}
				
				else if(operation == "-") {
					res = firstnum - secnum;
					answer = String.format("%.2f", res); 
					textField.setText(answer);
				}
				
				else if(operation == "*") {
					res = firstnum * secnum;
					answer = String.format("%.2f", res); 
					textField.setText(answer);
				}
				
				else if(operation == "/") {
					res = firstnum / secnum;
					answer = String.format("%.2f", res); 
					textField.setText(answer);
				}
				
				else if(operation == "%") {
					res = firstnum % secnum;
					answer = String.format("%.2f", res); 
					textField.setText(answer);
				}
				
			}
		});
		btnEquals.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEquals.setBounds(194, 285, 59, 51);
		frmCalculator.getContentPane().add(btnEquals);
		
	}

	
}
