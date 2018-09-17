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
	
	@Test
	public void thatRestaurantShouldAddTable(){
		List<Restaurant> restaurantList = Restaurant.getAllRestaurants();
		Restaurant restaurant = restaurantList.get(0);
		List<Table> tableList = restaurant.getTables();
		Table newTable = new Table(32);
		tableList.add(newTable);
		Assert.assertEquals(tableList.size(), Table.getAllTables().size());
	}
	
	@Test
	public void thatRestaurantShouldRemoveTheTable(){
		List<Restaurant> restaurantList = Restaurant.getAllRestaurants();
		Restaurant restaurant = restaurantList.get(0);
		List<Table> tableList = restaurant.getTables();
		tableList.remove(new Table(321));
		Assert.assertEquals(tableList.size(), Table.getAllTables().size());
	}

	@Test
	public void thatWaiterIsAssignedToBookedTable(){
		User user= new User(31);
		Restaurant restaurant= Restaurant.getAllRestaurants().get(0);
		user.bookTable(restaurant);
		Table reservedTable = user.getReservedTable(restaurant);
		String name = reservedTable.getWaiterName();
		Assert.assertEquals(Table.getAllTables().get(0).getWaiterName(), name );
	}
	
	@Test
	public void thatUserIsAbledToWriteReview(){
		User user = new User(007);
		Restaurant restaurant = Restaurant.getAllRestaurants().get(0);
		user.writeReview(restaurant, "Good service!!");
		Assert.assertNotNull(restaurant.getReviewList().size());;
	}
	
}

