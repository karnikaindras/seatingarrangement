package seatingarrangementoops;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yash.seatingarrangement.Seat;

public class ScreenSeatingArrangement {
	
	private String screenName;
	
	private Map<CategoryName, List<List<Seat>>> categoryToRowsOfSeats;
	
	public ScreenSeatingArrangement() {
		
		categoryToRowsOfSeats = new HashMap<>();
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public Map<CategoryName, List<List<Seat>>> getCategoryToRowsOfSeats() {
		return categoryToRowsOfSeats;
	}
	
	public void setCategoryToRowsOfSeats(Map<CategoryName, List<List<Seat>>> categoryToRowsOfSeats) {
		this.categoryToRowsOfSeats = categoryToRowsOfSeats;
	}
	
}
