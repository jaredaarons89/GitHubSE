
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class MeetingGUI extends JFrame
{
	//Views
	PanelMember myPanelMember;
	PanelEvent  myPanelEvent;
	PanelAttendance myPanelAttendance;

	public MeetingGUI()
	{
		setSize(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Meeting GUI");
		
		myPanelMember = new PanelMember();
		myPanelEvent = new PanelEvent();
		myPanelAttendance = new PanelAttendance();

		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Members", myPanelMember);
		tabbedPane.addTab("Events", myPanelEvent);
		tabbedPane.addTab("Attendance", myPanelAttendance);
		add(tabbedPane);
		pack();
		setVisible(true);	
	}
	
	public static void main(String []args)
	{
		new MeetingGUI();
	}

}
