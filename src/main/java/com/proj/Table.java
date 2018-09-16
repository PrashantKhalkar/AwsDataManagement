package com.proj;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private int tableNumber;
	private int reservedFor;
	private boolean isReserved = false;
	private String waiterName = "no waiter assigned";
	
	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}

	private static List<Table> list = new  ArrayList<Table>();
	
	static {
		list.add(new Table(321,"Ramesh"));
	}
	
	public Table() {
	}

	public Table(int i, String waiterName) {
		tableNumber =i;
		this.waiterName = waiterName;
	}

	public Table(int i) {
		tableNumber =i;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	
	public int getReservedFor() {
		return reservedFor;
	}

	public void setReservedFor(int reservedFor) {
		this.reservedFor = reservedFor;
	}

	
	public void reserveTableFor(int userId) {
		reservedFor = userId;
		isReserved = true;
		assignWaiiter();
	}

	private void assignWaiiter() {
		
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public boolean forUser(int userId) {
		return userId == reservedFor ? true : false;
	}

	public static List<Table> getAllTables() {	return list;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tableNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Table other = (Table) obj;
		if (tableNumber != other.tableNumber)
			return false;
		return true;
	}

	public String getWaiterName() {
		return waiterName;
	}

}
