import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import static javax.swing.GroupLayout.Alignment.*;
import java.awt.Component;
import java.awt.Insets;

public class Calculator extends JFrame implements ActionListener { 

	NumberPad buttons;
	JTextField display;
	String operator; //Operation pressed
	float operand1; //Operands 
	float operand2;
	float result; //Holds result of operations
	
	public Calculator() {
		//Create panels
		display = new JTextField();
		buttons = new NumberPad();
		
		Font font = new Font("SansSerif", Font.BOLD, 30);

		display.setFont(font);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setMargin(new Insets(10,0,10,0));
		

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
	    layout.setAutoCreateGaps(true);
	    layout.setAutoCreateContainerGaps(true);
	    
	    layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
	    		.addGroup(layout.createParallelGroup(LEADING)
	    				.addComponent(display)
	    		)
	    		.addGroup(layout.createSequentialGroup()
	    	    		.addComponent(buttons)
	    		)
	    );
	    
	    layout.setVerticalGroup(layout.createSequentialGroup()
	    		.addGroup(layout.createSequentialGroup()
	    				.addComponent(display)
	    		)
	    		.addGroup(layout.createParallelGroup(LEADING)
	    	    		.addComponent(buttons)
	    		)
	    );
	    
	  //Action listeners 
	  buttons.Zer.addActionListener(this);
	  buttons.One.addActionListener(this);
	  buttons.Two.addActionListener(this);
	  buttons.Thr.addActionListener(this);
	  buttons.Fou.addActionListener(this);
	  buttons.Fiv.addActionListener(this);
	  buttons.Six.addActionListener(this);
	  buttons.Sev.addActionListener(this);
	  buttons.Eig.addActionListener(this);
	  buttons.Nin.addActionListener(this);
	  buttons.Dot.addActionListener(this);
	  buttons.Inv.addActionListener(this);
	  buttons.Squ.addActionListener(this);
	  buttons.Per.addActionListener(this);
	  buttons.Bksp.addActionListener(this);
	  buttons.CE.addActionListener(this);
	  buttons.Clear.addActionListener(this);
	  buttons.Signs.addActionListener(this);
	  buttons.Div.addActionListener(this);
	  buttons.Mult.addActionListener(this);
	  buttons.Plu.addActionListener(this);
	  buttons.Min.addActionListener(this);
	  buttons.Mod.addActionListener(this);
	  buttons.Equ.addActionListener(this);
	   
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource() == buttons.Zer) {
		        display.setText(display.getText() + "0");
		        
		 }
		 else if (e.getSource() == buttons.One) {
		        display.setText(display.getText() + "1");

		 }
		 else if (e.getSource() == buttons.Two) {
		        display.setText(display.getText() + "2");
		        
		 }
		 else if (e.getSource() == buttons.Thr) {
		        display.setText(display.getText() + "3");
		        
		 }
		 else if (e.getSource() == buttons.Fou) {
		        display.setText(display.getText() + "4");
		        
		 }
		 else if (e.getSource() == buttons.Fiv) {
		        display.setText(display.getText() + "5");
		        
		 }
		 else if (e.getSource() == buttons.Six) {
		        display.setText(display.getText() + "6");
		        
		 }
		 else if (e.getSource() == buttons.Sev) {
		        display.setText(display.getText() + "7");
		        
		 }
		 else if (e.getSource() == buttons.Eig) {
		        display.setText(display.getText() + "8");
		        
		    }
		 else if (e.getSource() == buttons.Nin) {
		        display.setText(display.getText() + "9");
		        
		 }
		 else if(e.getSource() == buttons.Dot) {
			 display.setText(display.getText() + ".");
		 }
		 else if(e.getSource() == buttons.Clear) {
			 display.setText("");
		 }
		 else if(e.getSource() == buttons.Bksp) {
			  if(!display.getText().isEmpty()) {
	                display.setText(display.getText().substring(0,display.getText().length()-1));
			  		}
		 } 
		 else if(e.getSource() == buttons.CE) {
			 operand1 = 0;
			 operand2 = 0;
			 result = 0;
			 display.setText("");		 
		 }
		 else if(e.getSource() == buttons.Signs) {
		      if(!display.getText().substring(0,1).equals("-")) {
		    	  display.setText("-" + display.getText());
	            }
	            else {
	                display.setText(display.getText().substring(1, display.getText().length()));
	            }
		 }
		 else if(e.getSource() == buttons.Mult) {
			 operand1 = Float.parseFloat(display.getText());
			 display.setText("");
			 operator = "*";
		 }
		 else if(e.getSource() == buttons.Div) {
			 operand1 = Float.parseFloat(display.getText());
			 display.setText("");
			 operator = "/";
		 }
		 else if(e.getSource() == buttons.Plu) {
			 operand1 = Float.parseFloat(display.getText());
			 display.setText("");
			 operator = "+";
		 }
		 else if(e.getSource() == buttons.Min) {
			 operand1 = Float.parseFloat(display.getText());
			 display.setText("");
			 operator = "-";
		 }
		 else if(e.getSource() == buttons.Mod) {
			 operand1 = Float.parseFloat(display.getText());
			 display.setText("");
			 operator = "%";
		 }
		 else if(e.getSource() == buttons.Inv) {
			 float inverse = 1/(Float.parseFloat(display.getText()));
			 display.setText(Float.toString(inverse));
		 }
		 else if(e.getSource() == buttons.Squ) {
			 double squ = Math.sqrt(Double.parseDouble(display.getText()));
			 display.setText(Double.toString(squ));
		 }
		 else if(e.getSource() == buttons.Per) {
			 double per = Double.parseDouble(display.getText())/100;
			 display.setText(Double.toString(per));
		 }
		 else if(e.getSource() == buttons.Equ) {
			operand2 = Float.parseFloat(display.getText());
			if(operator == "*") {
				result = operand1*operand2;
				display.setText(Float.toString(result));
			}
			else if(operator == "/") {
				result = operand1/operand2;
				display.setText(Float.toString(result));
			}
			else if(operator == "+") {
				result = operand1+operand2;
				display.setText(Float.toString(result));
			}
			else if(operator == "-") {
				result = operand1-operand2;
				display.setText(Float.toString(result));
			}
			else if(operator == "%") {
				result = operand1%operand2;
				display.setText(Float.toString(result));
			}
		 }

	}

	public static void main(String[] args) {
		
		try {
	        // Set cross-platform Java L&F (also called "Metal")
	    UIManager.setLookAndFeel(
	        UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Calculator frame = new Calculator();
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}