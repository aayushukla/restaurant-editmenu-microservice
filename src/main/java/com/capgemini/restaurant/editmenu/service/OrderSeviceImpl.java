package com.capgemini.restaurant.editmenu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.restaurant.editmenu.dao.OrderDAO;
import com.capgemini.restaurant.editmenu.entity.Order;
import com.capgemini.restaurant.editmenu.service.OrderService;

@Service
public class OrderSeviceImpl implements OrderService {

	@Autowired
	private OrderDAO dao;

	@Override
	public List<Order> findAllOrders() {
		System.out.println(dao.findAll());
		return dao.findAll();
	}

	@Override
	public Optional<Order> findDishUsingId(int _id) {
		Optional<Order> dish= dao.findById(_id);
		return dish;
	}

	@Override
	public void deleteOrder(int _id) {
		dao.deleteById(_id);
	}

	@Override
	public Order addItems(Order order) {
		return dao.insert(order);
		
	}
}
