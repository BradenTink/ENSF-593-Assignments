import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Collections;
/**
 * 
 * Partial implementation of the Stats GUI
 *
 * @Braden Tink
 */
public class StatsGUI implements ActionListener {
	private JTextField inputField;
	private JTextArea display;
	private JButton reset, displayStats;
	private Stats stats;
	// TODO: Add stats instance variable

	public StatsGUI(String title) { 
		
		//TODO: Instantiate stats object
		this.stats = new Stats();
		
		
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300, 200);  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel prompt = new JLabel("Next Grade (press ENTER)");
		jfrm.add(prompt);
		
		this.inputField = new JTextField(4); 
		this.inputField.setText("");
		this.inputField.addActionListener( this ); 
		jfrm.add(inputField);
		
		this.display = new JTextArea (5 ,20);
		jfrm.add(display);
		
		displayStats = new JButton("STATS");
		displayStats.addActionListener(this);
		jfrm.add(displayStats);

		reset = new JButton("RESET");
		reset.addActionListener(this);
		jfrm.add(reset);
		
		jfrm.setVisible(true);	
		
		
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == inputField) {
			int number = Integer.parseInt(inputField.getText());
			//append the user inout to the display area
			this.display.append (number + " ");
			//add the number to the array using the add method
			stats.add(number);
			//Reset the input field
			this.inputField.setText("");
			
		}
		//Stats Button action event 
		if (e.getSource() == displayStats) {
			this.display.append("\n");
			//Stats button call the to string method which outputs all values
			this.display.append(stats.toString());
			
		}
		//Reset Button Event
		if (e.getSource() == reset) {
			//Set Display field to empty
			this.display.setText("");
			//Set Input field to empty
			this.inputField.setText("");
			//Recall constuctor so we have a new stats object to use
			this.stats = new Stats();
		}
	}

	public static void main(String[] args) {
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new StatsGUI("Grades statistics");
			}
		});
	}
}
