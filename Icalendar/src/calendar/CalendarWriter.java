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
	
	
}
