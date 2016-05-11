import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.*;

/**
 * Class EventCalendarFrame
 * Is a subclass of JFrame
 * Adds the 3 panels to JFrame
 * 
 * @author ranjeeta
 *
 */
public class EventCalendarFrame extends JFrame{
	
	// attributes
	
	private AddEventPanel addEvtPanel;
	private DisplayEventPanel displayEventPanel;
	private DeleteEventPanel deleteEventPanel;
	
	private GridLayout gridLayout;
	private Container c;

	// an object of type ManagerCalendarEvent
	private static ManagerCalendarEvent myMgrcalEvent= new ManagerCalendarEvent();
	
	// constructor
	public EventCalendarFrame()
	{
		// call constructor of the super class
		super("Event calender");
		
		// set layout manager
		setLayout(new BorderLayout(5,5));
		//setLayout(new FlowLayout());
	
	
		// create the eventPanel
		addEvtPanel = new AddEventPanel();
		
		// create the display calendar events panel
		displayEventPanel = new DisplayEventPanel();
		
		// create the display calendar events panel
		deleteEventPanel = new DeleteEventPanel();
		
				
		// create swing components to content pane
		
		 gridLayout = new GridLayout(3,1);
		 c = getContentPane();
		 setLayout(gridLayout);
		

		// add the panels to the container
		c.add(addEvtPanel);
		c.add(displayEventPanel);
		c.add(deleteEventPanel);
		

	}
	
	// method to return reference to ManagerCalendarEvent object
	public static ManagerCalendarEvent GetManagerCalendarEventRef()
	{
		return myMgrcalEvent;
		
	}


} // end of EventCalendarFrame
