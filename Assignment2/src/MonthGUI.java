import java.awt.*;
import java .awt. event .*;
import javax.swing.*; 

public class MonthGUI implements ActionListener{
	
	private JTextField inputField; 
	private JTextArea display;
	
	public MonthGUI(String title)  {
	
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(450, 200 );  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JLabel prompt = new JLabel("Input a month between 1 and 12 a hit Enter:");
		jfrm.add(prompt);
		
		inputField = new JTextField(2); 
		inputField.setText("0");
		inputField.addActionListener( this ); 
		jfrm.add(inputField);
		
	
		display = new JTextArea (1 ,30);
		jfrm.add(display);
		
		jfrm.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)  { 
		int number;
		int result;
		String value = "";
		//if the source comes from  the input feild then enter statement 
		if ( ae.getSource() == inputField) { 
			
			//hold the user value in the integer below 
			number = Integer.parseInt(inputField.getText());
			//if value is greater than 0 and less than 13 enter 
			if (number < 13 && number > 0) {
				
				//pass out the resulting amount of days and print the result
				this.display.append("For the " + number + " Month there are " +  Days.howManyDaysInMonth(number) + " days.\n");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MonthGUI("Days of Months");
			}
		});

	}

}
