package WindowsBuilder;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class calculadoraUI {

	private JFrame frmCalculator;
	private JTextField panel;
	private JTextField panel2;

	private double firstNumber, secondNumber;
	String result;
	StringBuilder str ;
	char operator;
	boolean resultP;
	Calculadora calc = new Calculadora();
	private List<String> lista = new LinkedList<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraUI window = new calculadoraUI();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void insert(JButton button) {
		panel.setText(panel.getText() + button.getText());
		panel2.setText(panel2.getText() + button.getText());
		
		if(lista.isEmpty()) {
			lista.add(button.getText());

		}else if(lista.get(lista.size()-1).equals("-")) {
			if(lista.size()>1) {
				lista.set(lista.size()-1, "+");
			}else {
				lista.remove(0);
			}
			String str = "-" + button.getText();
			lista.add(str);
		}else if(!lista.get(lista.size()-1).equals(String.valueOf(operator))) {
			String str2 = lista.get(lista.size()-1) + button.getText();
			lista.set(lista.size()-1, str2);
		}else {
			lista.add(button.getText());
		}
	}
	
	/**
	 * Create the application.
	 */
	public calculadoraUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// ALL FEATURES THE INTERFACE DESIGN HAS //
		
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.DARK_GRAY);
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 558, 662);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		panel = new JTextField();
		panel.setForeground(new Color(255, 204, 102));
		panel.setBackground(Color.GRAY);
		panel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.setBounds(39, 128, 465, 96);
		frmCalculator.getContentPane().add(panel);
		panel.setColumns(10);
		
		panel2 = new JTextField();
		panel2.setForeground(new Color(255, 204, 102));
		panel2.setBackground(Color.GRAY);
		panel2.setHorizontalAlignment(SwingConstants.CENTER);
		panel2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel2.setColumns(10);
		panel2.setBounds(39, 25, 465, 96);
		frmCalculator.getContentPane().add(panel2);
		
		// NUMBERS BUTTONS //
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(btn1);

			}
		});	
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.setBounds(39, 388, 85, 59);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.BLACK);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insert(btn2);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.setBounds(134, 388, 85, 59);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.BLACK);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(btn3);

			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.setBounds(229, 388, 85, 59);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.BLACK);
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(btn4);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.setBounds(39, 319, 85, 59);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.BLACK);
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insert(btn5);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.setBounds(134, 319, 85, 59);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.BLACK);
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				insert(btn6);


			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.setBounds(229, 319, 85, 59);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.BLACK);
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(btn7);

			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.setBounds(39, 248, 85, 59);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.BLACK);
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insert(btn8);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.setBounds(134, 248, 85, 59);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLACK);
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(btn9);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.setBounds(229, 248, 85, 59);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.BLACK);
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(btn0);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn0.setBounds(39, 457, 85, 59);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn_decimal = new JButton(".");
		btn_decimal.setForeground(Color.BLACK);
		btn_decimal.setBackground(Color.LIGHT_GRAY);
		btn_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insert(btn_decimal);


			}
		});
		btn_decimal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_decimal.setBounds(134, 457, 85, 59);
		frmCalculator.getContentPane().add(btn_decimal);
		
		// FEATURES BUTTONS //
		
		JButton btn_clear = new JButton("C");
		btn_clear.setForeground(Color.BLACK);
		btn_clear.setBackground(Color.LIGHT_GRAY);
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setText(null);
				panel2.setText(null);
				lista.clear();
				result = null;
				operator = ' ';
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_clear.setBounds(229, 457, 85, 59);
		frmCalculator.getContentPane().add(btn_clear);
		
		JButton btn_delete = new JButton("DEL");
		btn_delete.setForeground(Color.BLACK);
		btn_delete.setBackground(Color.LIGHT_GRAY);
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				String backspace2 = null;
				if(panel.getText().length()>0) {
					StringBuilder str = new StringBuilder(panel.getText());
					StringBuilder str2 = new StringBuilder(panel2.getText());
					
					str.deleteCharAt(panel.getText().length()-1);
					str2.deleteCharAt(panel2.getText().length()-1);

					backspace = str.toString();
					backspace2 = str2.toString();

					panel.setText(backspace);
					panel2.setText(backspace2);
					
					lista.get(lista.size()-1);

				}
			}
		});
		
		btn_delete.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_delete.setBounds(324, 457, 180, 59);
		frmCalculator.getContentPane().add(btn_delete);
		
		JButton btn_sol = new JButton("=");
		btn_sol.setForeground(Color.BLACK);
		btn_sol.setBackground(Color.LIGHT_GRAY);
		btn_sol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setText("");
				try {
					System.out.println(Arrays.toString(lista.toArray()));
					boolean finish = false;
					while(!finish) {
						for(int i = 0; i < lista.size();i++) {
							if(lista.get(i).equals("!")) {
								int number1 = Integer.parseInt(lista.get(i-1));
								result = String.valueOf(calc.fact(number1));
								lista.set(i-1, result);
								lista.remove(i);
								break;
							}
							if(i==lista.size()-1){
								finish=true;
							}	
						}
					}
					finish = false;
					System.out.println(Arrays.toString(lista.toArray()));
					while(!finish) {
						for(int i2 = 0; i2 < lista.size();i2++) {
							if(lista.get(i2).equals("/")) {
								firstNumber = Double.parseDouble(lista.get(i2-1));
								secondNumber = Double.parseDouble(lista.get(i2+1));
								result = String.valueOf(calc.divide(firstNumber, secondNumber));
								lista.set(i2-1, result);
								lista.remove(i2+1);
								lista.remove(i2);
								break;
							}else if(lista.get(i2).equals("*")) {
								firstNumber = Double.parseDouble(lista.get(i2-1));
								secondNumber = Double.parseDouble(lista.get(i2+1));
								result = String.valueOf(calc.mult(firstNumber, secondNumber));
								lista.set(i2-1, result);
								lista.remove(i2+1);
								lista.remove(i2);
								break;
							}
							if(i2==lista.size()-1){
								finish=true;
							}	
						}
					}
					
					finish = false;
					System.out.println(Arrays.toString(lista.toArray()));
					while(!finish) {
						for(int i2 = 0; i2 < lista.size();i2++) {
							if(lista.get(i2).equals("+")) {
								firstNumber = Double.parseDouble(lista.get(i2-1));
								secondNumber = Double.parseDouble(lista.get(i2+1));
								result = String.valueOf(calc.suma(firstNumber, secondNumber));
								lista.set(i2-1, result);
								lista.remove(i2+1);
								lista.remove(i2);
								break;
							}else if(lista.get(i2).equals("-")) {
								firstNumber = Double.parseDouble(lista.get(i2-1));
								secondNumber = Double.parseDouble(lista.get(i2+1));
								result = String.valueOf(calc.resta(firstNumber, secondNumber));
								lista.set(i2-1, result);
								lista.remove(i2+1);
								lista.remove(i2);
								break;
							}
							if(i2==lista.size()-1){
								finish=true;
							}	
						}
					}
					System.out.println(Arrays.toString(lista.toArray()));

					finish = false;
					while(!finish) {
						for(int i = 0; i < lista.size();i++) {
							if(lista.get(i).equals("P")) {
								int number1 = Integer.parseInt(lista.get(i-1));
								
								result = String.valueOf(calc.esPrimo(number1));
								lista.set(i-1, result);
								lista.remove(i);
								break;
							}
							if(i==lista.size()-1){
								finish=true;
							}	
						}
					}
					
					System.out.println(Arrays.toString(lista.toArray()));
					panel.setText(String.valueOf(result));
	
				}catch(ArithmeticException ex) {
					panel.setText("SYNTAX ERROR: " + ex.getMessage());
				}
						
			}
			
		});
		btn_sol.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_sol.setBounds(39, 526, 465, 78);
		frmCalculator.getContentPane().add(btn_sol);
		
			
		// OPERATORS BUTTONS //
		
		JButton btn_suma = new JButton("+");
		btn_suma.setForeground(Color.BLACK);
		btn_suma.setBackground(Color.LIGHT_GRAY);
		btn_suma.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(lista.isEmpty()) {
				panel.setText("INSERTE UN NUMERO PRIMERO");
			}else {
				operator ='+';

				panel.setText("");
				panel2.setText(panel2.getText() + " + ");
				lista.add(btn_suma.getText());
			}				
			}
		});
		btn_suma.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_suma.setBounds(324, 388, 85, 59);
		frmCalculator.getContentPane().add(btn_suma);
		
		JButton btn_resta = new JButton("-");
		btn_resta.setForeground(Color.BLACK);
		btn_resta.setBackground(Color.LIGHT_GRAY);
		btn_resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operator ='-';

				panel.setText("");
				panel2.setText(panel2.getText() + " - ");
				lista.add(btn_resta.getText());
			
			}
		});
		btn_resta.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_resta.setBounds(419, 388, 85, 59);
		frmCalculator.getContentPane().add(btn_resta);
		
		JButton btn_mult = new JButton("*");
		btn_mult.setForeground(Color.BLACK);
		btn_mult.setBackground(Color.LIGHT_GRAY);
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lista.isEmpty()) {
					panel.setText("INSERTE UN NUMERO PRIMERO");
				}else {
					operator ='*';

					panel.setText("");
					panel2.setText(panel2.getText() + " * ");
					lista.add(btn_mult.getText());
				}			
			}
		});
		btn_mult.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_mult.setBounds(324, 317, 85, 59);
		frmCalculator.getContentPane().add(btn_mult);
		
		JButton btn_div = new JButton("/");
		btn_div.setForeground(Color.BLACK);
		btn_div.setBackground(Color.LIGHT_GRAY);
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				if(lista.isEmpty()) {
					panel.setText("INSERTE UN NUMERO PRIMERO");
				}else {
					operator ='/';

					panel.setText("");
					panel2.setText(panel2.getText() + " / ");
					lista.add(btn_div.getText());

				}					
			}
			});
		btn_div.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_div.setBounds(419, 319, 85, 59);
		frmCalculator.getContentPane().add(btn_div);
		
		JButton btn_fact = new JButton("!");
		btn_fact.setForeground(Color.BLACK);
		btn_fact.setBackground(Color.LIGHT_GRAY);
		btn_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lista.add(btn_fact.getText());
				panel2.setText(panel2.getText() + "!");				
			}
			});
		btn_fact.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_fact.setBounds(324, 248, 85, 59);
		frmCalculator.getContentPane().add(btn_fact);
		
		JButton btn_esPrimo = new JButton("P");
		btn_esPrimo.setForeground(Color.BLACK);
		btn_esPrimo.setBackground(Color.LIGHT_GRAY);
		btn_esPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lista.add(btn_esPrimo.getText());
				panel2.setText(panel2.getText() + " , ¿es primo?");
						
			}});	
		btn_esPrimo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_esPrimo.setBounds(419, 248, 85, 59);
		frmCalculator.getContentPane().add(btn_esPrimo);
		
	
}
}