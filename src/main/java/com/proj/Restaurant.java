package com.proj;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private String restaurantName;
	private int number;
	static List<Restaurant> list = new  ArrayList<Restaurant>();

	static{
		list.add(new Restaurant(10,"kimchi"));
	}
	
	public Restaurant(int i, String name) {
		restaurantName = name;
		this.number = i;
	}

	public static List<Restaurant> getAllRestaurants() {
		if(null != list){
			return list;
			
		}
		return new ArrayList<Restaurant>();
	}

	public List<Table> getTables() {
		return Table.getAllTables();
		
	}

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

}
