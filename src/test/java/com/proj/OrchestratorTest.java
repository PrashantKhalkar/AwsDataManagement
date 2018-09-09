package com.proj;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class OrchestratorTest {

	
//user
	//can see/browse the restaurants
	//can book a table
	//can see the reserved table
	
	
	//restaurant can add/remove the tables
	//restaurant can assign a waiter to the table
	
	
	@Test
	public void thatUserShouldBrowseTheRestaurants(){
		User user = new User(1);
		List<Restaurant> restaurantList = user.browseRestaurants();
		Assert.assertNotNull(restaurantList.size());
	}
	
	@Test
	public void thatUserShouldSelectRestaurantAndBookTheTable(){
		User user = new User(1);
		List<Restaurant> restaurantList = user.browseRestaurants();
		user.bookTable(restaurantList.get(0));
		Assert.assertTrue(user.hasMadeReservation());
	}
	
	@Test
	public void thatUserShouldGetTheReservedTable(){
		User user = new User(1);
		List<Restaurant> restaurantList = user.browseRestaurants();
		user.bookTable(restaurantList.get(0));
		Table table = user.getReservedTable(restaurantList.get(0));
		Assert.assertEquals(table.getReservedFor(), user.getUserId());
	}
}

