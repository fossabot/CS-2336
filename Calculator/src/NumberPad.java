import static javax.swing.GroupLayout.Alignment.*;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.event.ChangeListener;

import javax.swing.*;

public class NumberPad extends JPanel {
	JButton Sev,Eig,Nin,Fou,Fiv,Six,One,Two,Thr,Zer,Dot,Bksp,CE,Mod,Clear,
		Signs,Div,Mult,Min,Plu,Squ,Per,Inv,Equ;
    public NumberPad() {
    	
    		Clear = new JButton("C");
		Bksp = new JButton("⬅︎");
		CE = new JButton("CE");
		Mod = new JButton("Mod");

		Sev = new JButton("7");
		Eig = new JButton("8");
		Nin = new JButton("9");
		Fou = new JButton("4");
		Fiv = new JButton("5");
		Six = new JButton("6");
		One = new JButton("1");
		Two = new JButton("2");
		Thr = new JButton("3");
		Zer = new JButton("0");
		Dot = new JButton(".");
	        
		Signs = new JButton("±");
		Div = new JButton("/");
		Mult = new JButton("*");
		Min = new JButton("-");
		Plu = new JButton("+");
		Squ = new JButton("√");
		Per = new JButton("%");
		Inv = new JButton("1/x");
		Equ = new JButton("=");
		
		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
	    layout.setAutoCreateGaps(true);
	    layout.setAutoCreateContainerGaps(true);
	    
	    Equ.setMargin(new Insets(17,17,17,17));
	    
	    layout.linkSize(SwingConstants.HORIZONTAL,
	    		Sev,Eig,Nin,Fou,Fiv,Six,One,Zer,Two,Thr,Dot,
	    		Bksp,CE,Mod,Clear,
	    		Signs,Div,Mult,Min,Plu,Squ,Per,Inv,Equ
	    	);
	    
	    //First two rows
	    layout.setHorizontalGroup(layout.createSequentialGroup()
	    		.addGroup(layout.createParallelGroup(LEADING)
			    .addComponent(Bksp)
			    .addComponent(Sev)
			    .addComponent(Fou)
			    .addComponent(One)
			    .addComponent(Zer)
	        )
	    		.addGroup(layout.createParallelGroup(LEADING)
			    .addComponent(CE)
			    .addComponent(Eig)
			    .addComponent(Fiv)
			    .addComponent(Two)
			    .addComponent(Dot)
			)
	    		.addGroup(layout.createParallelGroup(LEADING)
	        		.addComponent(Clear)
	        		.addComponent(Nin)
	        		.addComponent(Six)
	        		.addComponent(Thr)
	        		.addComponent(Mod)
	        )
	    		.addGroup(layout.createParallelGroup(LEADING)
	    		   .addComponent(Signs)
	    		   .addComponent(Div)
	    		   .addComponent(Mult)
	    		   .addComponent(Min)
	    		   .addComponent(Plu)
	    	    )
	    		.addGroup(layout.createParallelGroup(LEADING)
	            	.addComponent(Squ)
	            	.addComponent(Per)
	            	.addComponent(Inv)
	            	.addComponent(Equ)
	        )
	    );
	    
	    layout.setVerticalGroup(layout.createParallelGroup(LEADING)
	    		.addGroup(layout.createSequentialGroup()
			    .addComponent(Bksp)
			    .addComponent(Sev)
			    .addComponent(Fou)
			    .addComponent(One)
			    .addComponent(Zer)
	        )
	    		.addGroup(layout.createSequentialGroup()
			    .addComponent(CE)
			    .addComponent(Eig)
			    .addComponent(Fiv)
			    .addComponent(Two)
			    .addComponent(Dot)
			)
	    		.addGroup(layout.createSequentialGroup()
	        		.addComponent(Clear)
	        		.addComponent(Nin)
	        		.addComponent(Six)
	        		.addComponent(Thr)
	        		.addComponent(Mod)
	        )
	    		.addGroup(layout.createSequentialGroup()
	    		   .addComponent(Signs)
	    		   .addComponent(Div)
	    		   .addComponent(Mult)
	    		   .addComponent(Min)
	    		   .addComponent(Plu)
	    	    )
	    		.addGroup(layout.createSequentialGroup()
	            	.addComponent(Squ)
	            	.addComponent(Per)
	            	.addComponent(Inv)
	            	.addComponent(Equ)
	        )
	    );
	   
    } 
}