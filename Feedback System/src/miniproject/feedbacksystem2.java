package miniproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class feedback1 extends JFrame implements ActionListener{
		private static final String EXIT_ON_CLOSE = null;
		JLabel label;
		JButton b1;
 feedback1(){
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
        Container c = getContentPane(); 
        label = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\ARNAV GUPTA\\eclipse-workspace\\Feedback System\\src\\miniproject\\feedback.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(5, 10, size.width, size.height); 
        
        b1=new JButton(" START ");
        b1.setBounds(300,410,100,20);
		c.add(b1);
		b1.addActionListener(this);
        c.setBackground(Color. WHITE);
        c.add(label);
        
        c.setLayout(null);
	}
private void setDefaultCloseOperation(String exitOnClose) {
	// TODO Auto-generated method stub
	
}
public void actionPerformed(ActionEvent e) {
	
	new myframe();
	dispose();
	
}
	
}

public class feedbacksystem2 {

	public static void main(String[] args) {
		
		feedback1 f2=new feedback1();

	}

}
