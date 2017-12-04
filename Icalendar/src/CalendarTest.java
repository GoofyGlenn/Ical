import static org.junit.Assert.*;
import components.*;

import java.time.LocalDateTime;
import java.time.*;

import org.junit.Test;

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

	}
