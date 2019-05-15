package com.capgemini.restaurant.editmenu.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.restaurant.editmenu.entity.Order;


public interface OrderService {
	public List<Order> findAllOrders();
	public Optional<Order> findDishUsingId(int _id);
	public void deleteOrder(int _id);
	public Order addItems(Order order);
}
