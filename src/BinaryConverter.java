import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	JTextField text=new JTextField();
	JButton button=new JButton("convert");
	JLabel label=new JLabel();
	
	public BinaryConverter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	BinaryConverter a=new BinaryConverter();	
a.runnerMethod();
		
	}
	
	void runnerMethod() {
		
		
		frame.add(panel);
		
		text.setPreferredSize(new Dimension(400,200));
		panel.add(text);
		frame.setVisible(true);
		frame.setTitle("DO THE BINARY STUFF");
		
		panel.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		button.addMouseListener(this);
		panel.add(label);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String g=text.getText();
		
		label.setText(convert(g));
		frame.pack();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

	
	
	
	
}
