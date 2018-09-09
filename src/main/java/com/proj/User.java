package com.proj;

import java.util.List;

public class User {

	
	private int userId;
	private boolean madeReservation;
	
	public boolean isMadeReservation() {
		return madeReservation;
	}

	public void setMadeReservation(boolean madeReservation) {
		this.madeReservation = madeReservation;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public User(int i) {
		this.userId = i;
	}

	public List<Restaurant> browseRestaurants() {
		List<Restaurant> restaurantList = Restaurant.getAllRestaurants();
		return restaurantList;
	}

	public void bookTable(Restaurant restaurant) {
		// TODO Auto-generated method stub
		List<Table> tableList = restaurant.getTables();
		tableList.get(0).reserveTheTable(true, userId);
		this.madeReservation =true;
	}

	public Table getReservedTable(Restaurant restaurant) {
		// TODO Auto-generated method stub
		List<Table> tableList = restaurant.getTables();
		for(Table table:tableList){
			if(table.isReserved() && table.forUser(userId)){
				return table;
			}
		}
		return null;
	}

	public boolean hasMadeReservation() {
		return madeReservation == true ?true : false;
	}

}
