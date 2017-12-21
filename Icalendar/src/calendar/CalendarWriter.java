package calendar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CalendarWriter {
	
	BufferedWriter bw;
	public CalendarWriter (String filename) {
		try {
			FileWriter calwriter = new FileWriter(filename);
			bw = new BufferedWriter(calwriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public void write() {
		
	}
	
//	
//	public String write() {
//		try {
//			bw.write("BEGIN:VCALENDAR\r\n" + //ob
//					"VERSION:2.0\r\n" + // ob
//					"PRODID:-//hacksw/handcal//NONSGML v2.0//EN\r\n" + //ob
//					"BEGIN:VEVENT\r\n" + //ob
//					"UID:uid1@example.com\r\n" + //bn
//					"DTSTAMP:20170714T170000Z\r\n" + //bn
//					"ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com\r\n" + //bn
//					"DTSTART:20170714T170000Z\r\n" + //bn
//					"DTEND:20170715T0170000Z\r\n" + //ob
//					"SUMMARY:Bastille Day Party\r\n" + //bn alarm er den ob
//					"END:VEVENT\r\n" + //ob
//					"END:VCALENDAR");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return "BEGIN:VCALENDAR\r\n" + //ob
//		"VERSION:2.0\r\n" + // ob
//		"PRODID:-//hacksw/handcal//NONSGML v2.0//EN\r\n" + //ob
//		"BEGIN:VEVENT\r\n" + //ob
//		"UID:uid1@example.com\r\n" + //bn
//		"DTSTAMP:20170714T170000Z\r\n" + //bn
//		"ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com\r\n" + //bn
//		"DTSTART:20170714T170000Z\r\n" + //bn
//		"DTEND:20170715T0170000Z\r\n" + //ob
//		"SUMMARY:Bastille Day Party\r\n" + //bn alarm er den ob
//		"END:VEVENT\r\n" + //ob
//		"END:VCALENDAR";
//	}
////	
//	public void main(String [] args) {
//		CalendarWriter wirter = new CalendarWriter("test.ics");
//		wirter.write();
//	}
}
