package lab07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//import javax.swing.JPanel;


public class Calculator {

	static double nr1,nr2;
	static String A;
	
	static double nrf(JTextArea l) {
		return Double.parseDouble(l.getText());
		
	}
	static class U implements ActionListener{

		JTextArea area=new JTextArea();
		String numb;
		U(JTextArea l,String s){
			area=l;
			numb=s;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s=area.getText();
			area.setText(s+numb);
		}
		
	}
	
	static class Operatie implements ActionListener{
		JTextArea area=new JTextArea();
		String operatie;
		Operatie(JTextArea l,String op){
			area=l;
			operatie=op;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			nr1=nrf(area);
			area.setText("");
			A=operatie;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task();
	}

	public static void task() {
		JFrame gui=new JFrame("Calculator");
		gui.setLayout(null);
		
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,punct,plus,minus,ori,impartire,egal,Clear,radic;
		b0=new JButton("0");
		
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		punct=new JButton(".");
		plus=new JButton("+");
		minus=new JButton("-");
		ori=new JButton("*");
		impartire=new JButton("/");
		egal=new JButton("=");
		Clear=new JButton("C");
		radic=new JButton("sqrt");
		
	
		JTextArea l=new JTextArea();
		l.setBounds(20, 15, 210, 35);
		l.setVisible(true);
		gui.add(l);
		
		l.setEditable(false);
		
		plus.setBounds(20, 60, 45, 30);
		Operatie adun=new Operatie(l,plus.getText());
		plus.addActionListener(adun);
		plus.setVisible(true);
		
		b1.setBounds(75, 60, 45, 30);
		U a1=new U(l,b1.getText());
		b1.addActionListener(a1);
		b1.setVisible(true);
		
		b2.setBounds(130, 60, 45, 30);
		U a2=new U(l,b2.getText());
		b2.addActionListener(a2);
		b2.setVisible(true);
		
		b3.setBounds(185,60, 45, 30);
		U a3=new U(l,b3.getText());
		b3.addActionListener(a3);
		b3.setVisible(true);
		
		minus.setBounds(20, 100, 45, 30);
		Operatie scad=new Operatie(l,minus.getText());
		minus.addActionListener(scad);
		minus.setVisible(true);
		
		b4.setBounds(75, 100, 45, 30);
		U a4=new U(l,b4.getText());
		b4.addActionListener(a4);
		b4.setVisible(true);
		
		b5.setBounds(130, 100, 45, 30);
		U a5=new U(l,b5.getText());
		b5.addActionListener(a5);
		b5.setVisible(true);
		
		b6.setBounds(185,100, 45, 30);
		U a6=new U(l,b6.getText());
		b6.addActionListener(a6);
		b6.setVisible(true);
		
		ori.setBounds(20, 140, 45, 30);
		Operatie inm=new Operatie(l,ori.getText());
		ori.addActionListener(inm);
		ori.setVisible(true);
		
		b7.setBounds(75, 140, 45, 30);
		U a7=new U(l,b7.getText());
		b7.addActionListener(a7);
		b7.setVisible(true);
		
		b8.setBounds(130, 140, 45, 30);
		U a8=new U(l,b8.getText());
		b8.addActionListener(a8);
		b8.setVisible(true);
		
		b9.setBounds(185,140, 45, 30);
		U a9=new U(l,b9.getText());
		b9.addActionListener(a9);
		b9.setVisible(true);
		
		impartire.setBounds(20, 180, 45, 30);
		Operatie imp=new Operatie(l,impartire.getText());
		impartire.addActionListener(imp);
		impartire.setVisible(true);
		
		punct.setBounds(75, 180, 45, 30);
		U pct=new U(l,punct.getText());
		punct.addActionListener(pct);
		punct.setVisible(true);
		
		b0.setBounds(130, 180, 45, 30);
		U a0=new U(l,b0.getText());
		b0.addActionListener(a0);
		b0.setVisible(true);
		
		egal.setBounds(185, 180, 45, 30);
		egal.setVisible(true);
		
		Clear.setBounds(80, 220, 45, 30);
		Clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText("");
			}
		});
		Clear.setVisible(true);
		
		radic.setBounds(135, 220, 65, 30);
		Operatie rad=new Operatie(l,radic.getText());
		radic.addActionListener(rad);

		radic.setVisible(true);
		
		
		gui.add(b0);
		gui.add(b1);
		gui.add(b2);
		gui.add(b3);
		gui.add(b4);
		gui.add(b5);
		gui.add(b6);
		gui.add(b7);
		gui.add(b8);
		gui.add(b9);
		gui.add(punct);
		gui.add(plus);
		gui.add(minus);
		gui.add(ori);
		gui.add(impartire);
		gui.add(egal);
		gui.add(Clear);
		gui.add(radic);
		
		egal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nr2=nrf(l);
				double op=0;
				
				if(A=="+") {
					op=nr1+nr2;
				}
				
				if(A=="-") {
					op=nr1-nr2;
				}
				
				if(A=="*") {
					op=nr1*nr2;
				}
				
				if(A=="/") {
						try {
							if(nr2==0) {
								throw new Exception();	
							}
							op=nr1/nr2;
						}
						 catch (Exception e1) {
							 l.setText("Cannot divide by zero");
							}	
					}
						
				
				if(A=="sqrt") {
					op=Math.sqrt(nr1);
					
				}
				op=nr1;
				
			}
			
			
		});
	
		gui.getContentPane().setBackground(Color.CYAN);
		gui.setSize(280, 300);
		gui.setVisible(true);
		

	}
}
