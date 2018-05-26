package seatingarrangementFinal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SeatingArrangementUtility {

	public SeatingArrangementUtility() {
		
	}

	public List<Row> prepareSeatingArrangementForCategory(Category category) {
		List<Row> seatingArrangementforGivenCategory = new ArrayList<>();
		int maxRow = category.getMaximumRowsForThisCategory();
		int maxSeat = category.getMaximumSeatForRow();
		for (int i = 1; i <= maxRow; i++) {
			
			Row row = new Row();
			List<Seat> seatsInARow = new LinkedList<>();
			
			for (int j = 1; j <= maxSeat; j++) {
				Seat seat = new Seat(maxRow, j);
				seatsInARow.add(seat);
			}
			row.setSeatsInRow(seatsInARow);
			seatingArrangementforGivenCategory.add(row);
			maxSeat -= 2;
		}
		return seatingArrangementforGivenCategory;
		
	}
	
	public void displaySeatingArrangementForScreen(Map<Category, List<Row>> seatingArrangmentForScreen) {
		Set<Category> setOfCategories = new HashSet<Category>();
		setOfCategories = seatingArrangmentForScreen.keySet();
		for (Category category : setOfCategories) {
			List<Row> rowsInCategory = seatingArrangmentForScreen.get(category);
			printRowArrangement(rowsInCategory, category.getMaximumRowsForThisCategory());
		}
	}
	
	private void printRowArrangement(List<Row> rowsOfCategory, int maxRows) {
		int rowId =1;
		for (Row row : rowsOfCategory) {
			printSeatsForTheRow(row, rowId );
			System.out.println();
			rowId++;
		}
	}
	
	private void printSeatsForTheRow(Row row, int rowId) {

		System.out.print("R"+rowId+" ");
		for (Seat seat : row.getSeatsInRow()) {
			
			System.out.print(seat+" ");
		}
	}
	

}
