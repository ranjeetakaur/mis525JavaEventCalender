import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EventCalendarApplication {
	
		
	/*
	* method main
	* @params args
	*/
	public static void main(String[] args)
	{
		// create a Frame
		EventCalendarFrame myFrame= new EventCalendarFrame();
		
		// set size
		myFrame.setSize(600, 500); 
		
		// close when X is clicked
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// make Frame visible
		myFrame.setVisible(true);

		
	} // end of main


} // end class EventCalendarApplication
