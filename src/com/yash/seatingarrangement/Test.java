package com.yash.seatingarrangement;

import java.util.List;

public class Test {

	public static void main(String[] args) {
//		Seat seat = new Seat(1,1);
//		System.out.println(seat);
		Category category = new Category();
		category.setCategoryName(CategoryName.GOLD);
		List<List<Seat>> seatingArrangement =category.prepareSeatingArrangement(2, 10);
		category.printRowArrangement(seatingArrangement, 2);
		
	}

}
