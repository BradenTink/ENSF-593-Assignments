import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

/**
 * @Braden Tink 
 *
 */
/**
 * 
 * public class TextAnalsisGUI whihc implements ACtionListener
 * five instance variables JTextArea display, results
 * JButton reset, displayStats
 * TextAnalyzer Object textAnalyzer
 * 
 */
public class TextAnalysisGUI implements ActionListener{
	private JTextArea display, results;
	private JButton reset, displayStats;
	private TextAnalyzer textAnalyzer;
	
	/**
	 * Constructor for TextAnalysisGUI taking in one argument title
	 * Method then defines the JTextArea and buttons and adds them to the display 
	 * 
	 * 
	 */
	public TextAnalysisGUI(String title) {
		//Creation od dialog
		//With a inputarea
		//Two buttons anaylze reset 
		//output area / jtextarea 
		
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(1000, 600); 
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel prompt = new JLabel("Text Anaylsis");
		jfrm.add(prompt);
		
		//Main JTextArea
		this.display = new JTextArea (25,85);
		this.display.setLineWrap(true);

		this.display.setText("Enter or copy text.");
		jfrm.add(display);
		
		//Button Anaylsis 
		displayStats = new JButton("Anaylsis");
		displayStats.addActionListener(this);
		jfrm.add(displayStats);
		
		//Button Clear areas
		reset = new JButton("Clear");
		reset.addActionListener(this);
		jfrm.add(reset);
		
		//Results JTextArea
		this.results = new JTextArea (4 ,85);
		jfrm.add(results);
		
		jfrm.setVisible(true);	
		
	}
	
	/**
	 * public void method actionPerformed 
	 * takes in one argument ActionEvent e
	 * Checks to see if tbe event came from one of the two buttons 
	 * and performs the correct action
	 * 
	 */
	public void actionPerformed(ActionEvent e) {

		//Stats Button action event call toString to get the stats
		if (e.getSource() == displayStats) {
			this.textAnalyzer = new TextAnalyzer(display.getText());
			this.results.append(textAnalyzer.toString());
			this.results.append("\n");
		}
		//Reset Button Event reset the displays
		if (e.getSource() == reset) {
			this.display.setText("Enter or copy text.");
			this.results.setText(" ");
		}
	}
	/**
	 * public static void method main
	 * Takes in one argument String[] args
	 * creates a new TextAnalysisGUI passing in a string
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TextAnalysisGUI("TextAnalysisGUI");
			}
		});
	}

}
