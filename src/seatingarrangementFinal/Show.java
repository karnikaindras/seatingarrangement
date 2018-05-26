package seatingarrangementFinal;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Show {
	
	private Time startTime;
	private Time endTime;
	private Map<Category, List<Row>> seatingArrangement;
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public Map<Category, List<Row>> getSeatingArrangement() {
		return seatingArrangement;
	}
	public void setSeatingArrangement(Map<Category, List<Row>> seatingArrangement) {
		this.seatingArrangement = seatingArrangement;
	}
	
	

}
