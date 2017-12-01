package components;



public class Event {
	private String startdate= "DTSTART: ";
	private String enddate= "DTEND: ";
	
	public String startEvent() {
		return "BEGIN : VEVENT";
	}
	public String endEvent() {
		return "END: VEVENT";
	}
	
	
	public String getStartdate(String year, String month,String day, String hour, String minute ) {
		 String second="00";
		
		return startdate+ year+month+day+hour+minute+second;
	}
	public String getEnddate(String year, String month,String day, String hour, String minute ) {
		 String second="00";
		
		return enddate+ year+month+day+hour+minute+second;
	}

	
}