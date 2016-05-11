import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Class DisplayEventPanel
 * Is a subclass of JPanel
 * Creates a Panel to store JButton component
 * 
 * @author ranjeeta
 *
 */

public class DisplayEventPanel extends JPanel{
	
	// constructor
	public DisplayEventPanel(){
		
		// give a size to the Panel
		Dimension size = getPreferredSize();
		size.width=250;
		setPreferredSize(size);
		
		// set the border
		setBorder(BorderFactory.createTitledBorder("Display Calendar Events"));
		
		// create JButton called Display
		JButton jBDisplayCalEvents = new JButton("Display");
		
		setLayout (new GridBagLayout());
		GridBagConstraints gC= new GridBagConstraints();
		gC.anchor = GridBagConstraints.CENTER;
		
		// add component to the Panel
		add(jBDisplayCalEvents);
		
		// register action listener
		jBDisplayCalEvents.addActionListener(new DisplayEventButtonHandler() );
				
	} // end constructor

	/**	 
	 * Class DisplayEventButtonHandler
	 * Display Button has been clicked
	 * List all the events registered so far
	 */
	
	private class DisplayEventButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			ManagerCalendarEvent myMgrcalEvent = EventCalendarFrame.GetManagerCalendarEventRef();
			
			String s = myMgrcalEvent.displayAllCalendarEvents();

			// display the events
			JOptionPane.showMessageDialog(null,s);
		}
		
	} // end class ButtonHandler

} // end class DisplayEventPanel
