package seatingarrangementoops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.yash.seatingarrangement.Category;
import com.yash.seatingarrangement.Seat;

public class Test {

	public static void main(String[] args) {
		ScreenSeatingArrangement sa = new ScreenSeatingArrangement();
		sa.setScreenName("Audi-1");
		Category gold = new Category();
		List<List<Seat>> listOFRowsForGold = gold.prepareSeatingArrangement(2,10);
		Map<CategoryName,List<List<Seat>>> goldClassArrangement = new HashMap<>();
		goldClassArrangement.put(CategoryName.GOLD, listOFRowsForGold);
		Set<CategoryName> set = new HashSet<CategoryName>();
		set =goldClassArrangement.keySet();
		
		for (CategoryName categoryName : set) {
			gold.printRowArrangement(goldClassArrangement.get(categoryName), 10);
		}
	}

}
