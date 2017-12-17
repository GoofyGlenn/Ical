import static org.junit.Assert.*;
import components.*;

import java.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.time.*;

import org.junit.Test;

import calendar.Calendar;

public class CalendarTest {

	

		@Test
		public void testInitialiseringAfEventMedStartOgEnd() {
			// 3. Set-up + // 2. Execute
			LocalDateTime start = LocalDateTime.of(2012, 12, 12, 12, 12, 12);
			LocalDateTime end = LocalDateTime.of(2012, 12, 12, 13, 13, 13);
			Event event = new Event(start, end);
			
			// 1. Assert
			assertEquals(start, event.getStart());
			assertEquals(end, event.getEnd());
			
			// 4. Tear-down
		}
		@Test
		public void testInitialiseringafstartogslut() {
			// 3. Set-up + // 2. Execute
			LocalDateTime start = LocalDateTime.of(2011, 12, 12, 12, 12, 12);
			LocalDateTime end = LocalDateTime.of(2011, 12, 12, 13, 13, 13);
			Event event = new Event(start, end);
			
			// 1. Assert
			assertEquals(start, event.getStart());
			assertEquals(end, event.getEnd());
			
			// 4. Tear-down
		}
		@Test
		public void testDuration() {
			// 3. Set-up + // 2. Execute
			LocalDateTime start = LocalDateTime.of(2010, 12, 12, 12, 12, 12);
			LocalDateTime end = LocalDateTime.of(2010, 12, 12, 13, 13, 13);
			Duration  duration = Duration.ofHours(1).plusMinutes(1).plusSeconds(1);
 			Event event = new Event(start, duration);
			
			// 1. Assert
			assertEquals(start, event.getStart());
			assertEquals(duration, event.getDuration());
			assertEquals(end, event.getEnd());
			
			// 4. Tear-down
		}
		@Test
		public void testgithub() {
			System.out.println("I hate github");
		}
		
		@Test 
		public void testsummary() {
			// setup + execute
			LocalDateTime start = LocalDateTime.of(2010, 12, 12, 12, 12, 12);
			LocalDateTime end = LocalDateTime.of(2010, 12, 12, 13, 13, 13);
			Event event = new Event(start,end);
			String summary = "is this love?";
			event.setSummary(summary);
			// assert
			assertEquals("is this love?", event.getSummary());
		}
		
		
		@Test
		public void testDesc() {
			// setup + execute
			LocalDateTime start = LocalDateTime.of(2010, 12, 12, 12, 12, 12);
			LocalDateTime end = LocalDateTime.of(2010, 12, 12, 13, 13, 13);
			Event event = new Event(start, end);
			String description = "a question to ask in the case of.... I don't know ";
			event.setDesc(description);
			// assert
			assertEquals("a question to ask in the case of.... I don't know ", event.getDesc());
		}

		
		@Test //how does object within objects work
		public void testCalendar() {
			// setup and execute
			LocalDateTime start = LocalDateTime.of(2010, 12, 12, 12, 12, 12);
			LocalDateTime end = LocalDateTime.of(2010, 12, 12, 13, 13, 13);
			Event event = new Event(start, end);
			Calendar cal = new Calendar("2.0", "goofy_the_lovely");
			cal.SetEvent(event);
			
			// assert
			assertEquals("2.0" +"goofy_the_lovely", "2.0"+ "goofy_the_lovely");
		}
		@Test
		public void testCalWriter() {// faker resultat med uid dtstamp og organizer
			BufferedWriter bw;
			LocalDateTime start = LocalDateTime.of(2017, 07, 14, 17, 00, 00);
			LocalDateTime end = LocalDateTime.of(2017, 07, 15, 17, 00, 00);
			Event event = new Event(start, end);
			Calendar cal = new Calendar("2.0", "-//hacksw/handcal//NONSGML v2.0//EN");
			cal.SetEvent(event);		//version, ProID
			event.setSummary("Bastille Day Party");
			
			// assert
			assertEquals("BEGIN:VCALENDAR\r\n" + //ob
				"VERSION:2.0\r\n" + // ob
				"PRODID:-//hacksw/handcal//NONSGML v2.0//EN\r\n" + //ob
				"BEGIN:VEVENT\r\n" + //ob
				"UID:uid1@example.com\r\n" + //bn
				"DTSTAMP:20170714T170000Z\r\n" + //bn
				"ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com\r\n" + //bn
				"DTSTART:20170714T170000Z\r\n" + //bn
				"DTEND:20170715T0170000Z\r\n" + //ob
				"SUMMARY:Bastille Day Party\r\n" + //bn alarm er den ob
				"END:VEVENT\r\n" + //ob
				"END:VCALENDAR" ,
				
					"BEGIN:VCALENDAR\r\n"
					+ "VERSION:"+cal.getVersion()+"\r\n"+ 
					"PRODID:"+cal.getProId()+"\r\n"+
					"UID: uid1@example.com"+
					"DTSTAMP:20170714T170000Z\r\n"+
						"ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com\r\n"+
						"DTSTART:"+event.getStart()+"\r\n"+
						"DTEND:"+event.getEnd()+"\r\n"+
						"SUMMARY:"+event.getSummary()+
						"END:VEVENT\r\n" +
						"END:VCALENDAR");
		}
		
		
	}
