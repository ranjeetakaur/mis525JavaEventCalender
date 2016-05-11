import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class AddEventPanel
 * Is a subclass of JPanel
 * Creates a Panel to store 5 components
 * 3 JTextField, 2 RadioButton, 1JButton
 * 
 * @author ranjeeta
 *
 */


public class AddEventPanel extends JPanel{
	
	// attributes
	
	// labels and their corresponding TxtFields
	
	// Event Title
	private JLabel calEventTitleLabel = new JLabel("Event Title");
	private  JTextField calEventTitleTxtField = new JTextField(10);
	
	// Date
	private JLabel calEventDateLabel = new JLabel("Date m/d/yy");
	private JTextField calEventDateTxtField = new JTextField(10);
	
	// Time
	private JLabel calEventTime = new JLabel("Time");
	private JTextField calEventTimeTxtField = new JTextField(10);
	
	// radiobuttons AM and PM
	private JRadioButton jbTimeAm = new JRadioButton("AM",true);
	private JRadioButton jbTimePm = new JRadioButton("PM",false);
	
	/*
	// constructor
	*/
	public AddEventPanel()
	{
		// give a size to the Panel
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		// set the border
		setBorder(BorderFactory.createTitledBorder("Add an Event"));
		
		
		
		// group the radio buttons
		ButtonGroup group = new ButtonGroup();
        group.add(jbTimeAm);
	    group.add(jbTimePm);

		// Jbutton "Add"
		JButton addCalEvent = new JButton("Add");
		
		// set the lauout
		setLayout (new GridBagLayout());
		GridBagConstraints gC= new GridBagConstraints();
		
		// first column
		gC.anchor = GridBagConstraints.LINE_END;
		
		gC.weightx=0.5;
		gC.weighty=0.5;
		
				
		gC.gridx=0;
		gC.gridy=0;
		add(calEventTitleLabel,gC);
		
		gC.gridx=0;
		gC.gridy=1;
		add(calEventDateLabel, gC);
		
		gC.gridx=0;
		gC.gridy=2;
		add(calEventTime, gC);
		
		// second column
		gC.anchor = GridBagConstraints.LINE_START;
		
		gC.gridx=1;
		gC.gridy=0;
		add(calEventTitleTxtField, gC);
		
			
		gC.gridx=1;
		gC.gridy=1;
		add(calEventDateTxtField, gC);
		
		gC.gridx=1;
		gC.gridy=2;
		add(calEventTimeTxtField, gC);
		
		gC.gridx=3;
		gC.gridy=2;
		add(jbTimeAm, gC);
		
		gC.gridx=4;
		gC.gridy=2;
		add(jbTimePm, gC);
		
		
		//gC.weightx=1;
		gC.anchor = GridBagConstraints.LINE_END;
		gC.gridx=1;
		gC.gridy=3;
		
		// add to panel
		add(addCalEvent, gC);
		
		// register action listener
		addCalEvent.addActionListener(new AddEventButtonHandler() );	
		
		
	} // end constructor
	
	/*
	 * Class AddEventButtonHandler
	 * 
	 */	
	private class AddEventButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			ManagerCalendarEvent myMgrcalEvent = EventCalendarFrame.GetManagerCalendarEventRef();
			
			String eventDes = calEventTitleTxtField.getText();
			String eventDate = calEventDateTxtField.getText();
			String eventTime = calEventTimeTxtField.getText();
			String amPm; 
	
			int eventId = myMgrcalEvent.createEventIdCalEventFromArrayList();
			

			if (jbTimeAm.isSelected())
			{
				amPm = "AM";
			}
			else
			{
				amPm = "PM";
			}
			
		
			// add the event to EventList
			CalendarEvent event = new CalendarEvent(eventId,eventDes,eventDate,eventTime,amPm);
			myMgrcalEvent.addCalEventToArrayList(event);
		}
		
	} // end class ButtonHandler


} // end class AddEventPanel
