
/*
 * Class CalendarEvent
 * This class contains details of an event like its description,date and time
 * 
 * @author Ranjeeta
 */

public class CalendarEvent {
	
	/*
	// attribute variables
	*/
	
	private int 	_eventId;
	private String 	_eventTitle;
	private String 	_eventDate;  // m/d/y format
	private String 	_eventTime;
	private String 	_amPM;
	
	/*
	// class methods
	*/
	
	// constructor 
	public CalendarEvent(int _eventId,String _eventTitle,String _eventDate,String _eventTime,String _amPM)
	{
		this._eventId =_eventId;
		this._eventTitle = _eventTitle;
		this._eventDate= _eventDate;
		this._eventTime = _eventTime;
		this._amPM = _amPM;
		
		
	}

	// set the Event ID of the event 	
	public void setCalendarEventId(int _eventId)
	{
		// edit an event
		this._eventId = _eventId;
	}
	
	// return the string representation of the class	
	public String toString()
	{
		return String.format("%d. %s on %s at %s %s",_eventId,_eventTitle,_eventDate,_eventTime,_amPM);
	}


} // end Class CalendarEvent
