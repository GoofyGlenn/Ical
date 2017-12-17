package calendar;

import components.*;

public class Calendar {
	
	// �ndrer denne class til at kun indeholde objekter som events og f�lgende
	//obligatoriske v�rdier er PROID og VERSION og bruges i constructor
	private String version ;
	private String ProId ;
	
	// field med calendar componenter
	private Event event;
	
	
	
	// calendar constructor
	public Calendar(String version, String proid ) {
		this.version=version;
		this.ProId=proid;
	}		
	
	
	
	
	
	// set og get metoder til componenter
	public void SetEvent(Event event) {
		this.event=event;
	}
			
	public Event getEvent() {
		return event;
	}
	
	
	/*
	 * publlic startEvent (string startdate-)
	 * tager input fra gui som string
	 * "dag/m�ned/�r/time/minut/sekund bliver default"
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
////				//"DURATION: PT1H0M0S\r\n"+ //ob m� ikke v�re der hvis DTEND ogs� er der
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
//		bw.write("UID:goofylovely@live.dk\r\n");// hvad er UID? er ikke n�dvendig
//		bw.write("DTEND:2017 11 16 T18 00 00Z\r\n"); // user
//		bw.write("SUMMARY: is this done right?\r\n"); // user
//		bw.write("END: VEVENT\r\n"); // skrives n�r bruger er f�rdig
//		bw.write("END: VCALENDAR"); // skrives n�r bruger er f�rdig
//		bw.close();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	}
//	
//	
	}
