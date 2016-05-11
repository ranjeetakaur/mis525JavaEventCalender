import java.util.ArrayList;

/*
 * Class ManagerCalendarEvent
 * This class manages all the registered events
 * 
 * @author Ranjeeta 
 */

public class ManagerCalendarEvent {
	
	/*
	// attributes variables
	*/
	
	// ArrayList of class CalendarEvent
	private ArrayList<CalendarEvent> _calEventArrayList;
	
	
	/*
	// class methods
	*/
	
	// constructor
	public ManagerCalendarEvent()
	{
		// create an arrayList of class CalendarEvent
		_calEventArrayList = new ArrayList<CalendarEvent>();
		
	}

	// method to add an event to the eventList
	public void addCalEventToArrayList(CalendarEvent _event)
	{
		  _calEventArrayList.add(_event);
		  
	}
	
	// method to display all the events
	public String displayAllCalendarEvents()
	{
				
		  // print all the events in the array list
		  if (_calEventArrayList.size() == 0)
		  {
			 return ("Calender events 0");
		  }
		  else
		  {
			  String s = "";
			  for (CalendarEvent event : _calEventArrayList)
			  {
				s = s.concat(event.toString()) ;
				s = s.concat("\n") ;				
				  
			  }
			  
			  return s;
			  
		  }
		  
	} // end of method displayAllCalendarEvents
	

	// method to make eventID for an event
	public  int createEventIdCalEventFromArrayList()
	{
		// eventId = size of list + 1
	 	return (_calEventArrayList.size()+1);
		  
	}

	 
	// method to delete event from list
	public  void deleteCalEventFromArrayList(int eventId)
	{
		CalendarEvent tempEvent;
		
		// validate eventID
		int arrySize =_calEventArrayList.size();
		
		if ((arrySize!= 0) && (eventId <= arrySize))
		{
			// remove from the list
			// index in the arrayList will be eventID -1
			_calEventArrayList.remove(eventId-1);
			
			// an event has been deleted ,correct the eventId`s of remaining events
			for(; eventId <= _calEventArrayList.size(); eventId++)
			{
				tempEvent = _calEventArrayList.get(eventId-1);
				tempEvent.setCalendarEventId(eventId);
			}
		
		} // end if
		  
	}
	 
	
} // end of class ManagerCalendarEvent
