package calendar;

import java.io.BufferedWriter;	
import java.io.FileWriter;
import java.io.IOException;
import components.*;

public class Calendar {
	// brug local date time til anvendelse 	
	Event event;
	
	BufferedWriter bw;
	public Calendar (String filename) {
		try {
			FileWriter calwriter = new FileWriter(filename);
			bw = new BufferedWriter(calwriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Calendar(String filename, Event event) {
		
	}
	public Event getEvent() {
		return event;
	}
	
	
	/*
	 * publlic startEvent (string startdate-)
	 * tager input fra gui som string
	 * "dag/måned/år/time/minut/sekund bliver default"
	 */
	
	

//	public void createCal () {
//	try {
//		// ande container elementer i en calendar
//		// ob = obligatorisk
//		// bn = bonus
//		// VTODO?? hvordan passer den ind?
//		
////		bw.write("BEGIN:VCALENDAR\r\n" + //ob
////				"VERSION:2.0\r\n" + // ob
////				"PRODID:-//hacksw/handcal//NONSGML v2.0//EN\r\n" + //ob
////				"BEGIN:VEVENT\r\n" + //ob
////				//"DURATION: PT1H0M0S\r\n"+ //ob må ikke være der hvis DTEND også er der
////				"UID:uid1@example.com\r\n" + //bn
////				"DTSTAMP:20170714T170000Z\r\n" + //bn
////				"ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com\r\n" + //bn
////				"DTSTART:20170714T170000Z\r\n" + //bn
////				"DTEND:20170715T035959Z\r\n" + //ob
////				"SUMMARY:Bastille Day Party\r\n" + //bn alarm er den ob
////				"END:VEVENT\r\n" + //ob
////				"END:VCALENDAR"); // ob
//				//bw.close();
//		bw.write("BEGIN:VCALENDAR\r\n");// auto = skrives automatisk
//		bw.write("VERSION: 2.0\r\n"); // auto
//		bw.write("PRODID: -// Goofytest //v2.0//EN\r\n"); // auto
//		bw.write("BEGIN: VEVENT\r\n"); // auto
//		bw.write("DTSTART:2017 11 15 T18 00 00Z\r\n"); // user = bruger indtastning
//		bw.write("UID:goofylovely@live.dk\r\n");// hvad er UID? er ikke nødvendig
//		bw.write("DTEND:2017 11 16 T18 00 00Z\r\n"); // user
//		bw.write("SUMMARY: is this done right?\r\n"); // user
//		bw.write("END: VEVENT\r\n"); // skrives når bruger er færdig
//		bw.write("END: VCALENDAR"); // skrives når bruger er færdig
//		bw.close();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	}
//	
//	
	}
