package com.calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Window.Type;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Container;

public class DaA {

	private JFrame frmGorazdsCalc;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private JButton btn2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaA window = new DaA();
					window.frmGorazdsCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	
	public DaA() {
		initialize();
	}

	
	private void initialize() {
		frmGorazdsCalc = new JFrame();
		frmGorazdsCalc.setTitle("Gorazd's calc\r\n");
		frmGorazdsCalc.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmGorazdsCalc.getContentPane().setBackground(Color.WHITE);
		frmGorazdsCalc.setBackground(Color.WHITE);
		frmGorazdsCalc.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 18));
		frmGorazdsCalc.setBounds(100, 100, 298, 400);
		frmGorazdsCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGorazdsCalc.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 259, 58);
		frmGorazdsCalc.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String BackSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					BackSpace=str.toString();
					textField.setText(BackSpace);
					
				}
			}
		});
		btnBackSpace.setBounds(10, 80, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 134, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 188, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLACK);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 242, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 296, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(75, 80, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(140, 80, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn00);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(205, 80, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnAdd);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(75, 134, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(75, 188, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(75, 242, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(75, 296, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnDot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(140, 134, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(140, 188, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(140, 242, 65, 54);
		frmGorazdsCalc.getContentPane().add(btn3);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(140, 296, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnPercent);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtract.setBounds(205, 134, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnSubtract);
		
		JButton btnMultiple = new JButton("*");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiple.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiple.setBounds(205, 188, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnMultiple);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(205, 242, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnDivide);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(205, 296, 65, 54);
		frmGorazdsCalc.getContentPane().add(btnEquals);
		
		JLabel label = new JLabel("New label");
		label.setBounds(55, 23, 48, 14);
		frmGorazdsCalc.getContentPane().add(label);
	}
}
