package seatingarrangementFinal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Category category1 = new Category(CategoryName.GOLD, 2, 10);
		Category category2 = new Category(CategoryName.SILVER, 2, 10);
		Category category3 = new Category(CategoryName.PREMIUM, 2, 10);
		SeatingArrangementUtility stu = new SeatingArrangementUtility();
		Screen screen = new Screen();
		List<Row> arrangementForGold = stu.prepareSeatingArrangementForCategory(category1);
		List<Row> arrangementForSilver = stu.prepareSeatingArrangementForCategory(category2);
		List<Row> arrangementForPremium = stu.prepareSeatingArrangementForCategory(category3);
		
		Map<Category,List<Row>> seatingArrangementForScreen = new HashMap<>();
		
		seatingArrangementForScreen.put(category1, arrangementForGold);
		seatingArrangementForScreen.put(category2, arrangementForSilver);
		seatingArrangementForScreen.put(category1, arrangementForPremium);
		
//		screen.setSeatingArrangement(seatingArrangementForScreen);
		
		stu.displaySeatingArrangementForScreen(seatingArrangementForScreen);

	}

}
