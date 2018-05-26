package com.yash.seatingarrangement;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private CategoryName categoryName;
	
	private int maximumRowsForThisCategory;
	
	private int maximumSeatForRow;
	
	List<List<Seat>> seatingArrangement;
	
	
	public CategoryName getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(CategoryName categoryName) {
		this.categoryName = categoryName;
	}

	public int getMaximumRowsForThisCategory() {
		return maximumRowsForThisCategory;
	}
	
	public void setMaximumRowsForThisCategory(int maximumRowsForThisCategory) {
		this.maximumRowsForThisCategory = maximumRowsForThisCategory;
	}
	
	public int getMaximumSeatForRow() {
		return maximumSeatForRow;
	}

	public void setMaximumSeatForRow(int maximumSeatForRow) {
		this.maximumSeatForRow = maximumSeatForRow;
	}

	public List<List<Seat>> prepareSeatingArrangement(int maxRows, int maxSeats) {
		
		List<List<Seat>> seatingArrangement = new ArrayList<>();
		for(int i=1; i<= maxRows; i++) {
			
			List<Seat> rowList = new ArrayList<>();
			for(int j =1; j<= maxSeats; j++ ) {
				Seat seat = new Seat(maxRows, j);
				rowList.add(seat);
			}
			maxSeats -= 2;
			seatingArrangement.add(rowList);
		}
		return seatingArrangement;
	}
	
	public void printRowArrangement(List<List<Seat>> seatingArrangement, int maxRows) {
		int count =1;
		for (List<Seat> list : seatingArrangement) {
			printSeatsForTheRow(list, count );
			System.out.println();
			count++;
		}
	}
	
	public void printSeatsForTheRow(List<Seat> seatList, int rowId) {

		System.out.print("R"+rowId+" ");
		for (Seat seat : seatList) {
			
			System.out.print(seat+" ");
		}
	}

}
