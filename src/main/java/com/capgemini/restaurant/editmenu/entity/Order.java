package com.capgemini.restaurant.editmenu.entity;

public class Order {

	private int _id;
	private String dishName;
	private double price;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int _id, String dishName, double price) {
		super();
		this._id = _id;
		this.dishName = dishName;
		this.price = price;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
