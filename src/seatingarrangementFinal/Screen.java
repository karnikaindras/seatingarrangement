package seatingarrangementFinal;

import java.util.List;
import java.util.Map;

public class Screen {
	
	private String screenName;
	
	private Map<Category, List<Row>> seatingArrangement;

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Map<Category, List<Row>> getSeatingArrangement() {
		return seatingArrangement;
	}

	public void setSeatingArrangement(Map<Category, List<Row>> seatingArrangement) {
		this.seatingArrangement = seatingArrangement;
	}
	
	

}
