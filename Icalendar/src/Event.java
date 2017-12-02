import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
	private LocalDateTime start;
	private LocalDateTime end;
	private String summary;

	public Event(LocalDateTime start, LocalDateTime end) {
		this.start=start;
		this.end=end;
	}

	public Event(LocalDateTime start, Duration duration) {
		this(start, start.plus(duration));
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public Duration getDuration() {
		return Duration.from(Duration.between(start, end));
	}

	public void setSummary(String summary) {
		this.summary=summary;
	}

	public String getSummary() {
		return summary;
	}

}
