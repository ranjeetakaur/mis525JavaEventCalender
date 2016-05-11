import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Class DeleteEventPanel
 * Is a subclass of JPanel
 * Creates a Panel to store JButton component
 * 
 * @author ranjeeta
 *
 */


public class DeleteEventPanel extends JPanel{
	
	// constructor
	public DeleteEventPanel(){
		
		// give a size to the Panel
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		// set the border
		setBorder(BorderFactory.createTitledBorder("Delete Calendar Events"));
		
		// create JButton
		JButton jBDeleteCalEvents = new JButton("Delete");
		
		// set the layout
		setLayout (new GridBagLayout());
		GridBagConstraints gC = new GridBagConstraints();
		gC.anchor = GridBagConstraints.CENTER;
		
		// add component to JPanel
		add(jBDeleteCalEvents);
		
		// register action listener
		jBDeleteCalEvents.addActionListener(new DeleteEventButtonHandler() );
		
	} // end constructor
	
	/**	 
	 * Class DeleteEventButtonHandler
	 * Delete Button has been clicked
	 * Delete the indexed event
	 */
	private class DeleteEventButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			ManagerCalendarEvent myMgrcalEvent = EventCalendarFrame.GetManagerCalendarEventRef();
			
			//JOptionPane.showMessageDialog(null,"Delete clicked");
			
			String s = "Enter the ID of the event to be deleted\n";
			s = s.concat(myMgrcalEvent.displayAllCalendarEvents());
			
			// get the user entered eventID
			String eventId = JOptionPane.showInputDialog(s);
			
			// 
			myMgrcalEvent.deleteCalEventFromArrayList(Integer.valueOf(eventId));

		}
		
	} // end class ButtonHandler

} // end class DeleteEventPanel
