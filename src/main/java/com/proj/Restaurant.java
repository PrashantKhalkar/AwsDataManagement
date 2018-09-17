package com.proj;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private String restaurantName;
	private int uniqueNumber;
	private List<String> reviewList = new ArrayList<>();;
	static List<Restaurant> list = new ArrayList<Restaurant>();
	
	static {
		list.add(new Restaurant(10, "kimchi"));
	}

	public Restaurant() {
		super();
	}

	public Restaurant(int i, String name) {
		restaurantName = name;
		this.uniqueNumber = i;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(int uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}


	public List<String> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<String> reviewList) {
		this.reviewList = reviewList;
	}

	public static List<Restaurant> getAllRestaurants() {
		if (null != list) {
			return list;

		}
		return new ArrayList<Restaurant>();
	}

	public List<Table> getTables() {
		return Table.getAllTables();

	}

	public void addReview(String review) {
		reviewList.add(review);
	}

}
