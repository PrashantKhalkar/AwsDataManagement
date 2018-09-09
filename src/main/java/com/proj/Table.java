package com.proj;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private int tableNumber;
	private int reservedFor;
	private boolean isReserved = false;
	private static List<Table> list = new  ArrayList<Table>();
	static {
		list.add(new Table(321));
	}
	
	public Table() {
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

	
	public void reserveTheTable(boolean flag, int userId) {
		reservedFor =userId;
		isReserved = flag;
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

}
