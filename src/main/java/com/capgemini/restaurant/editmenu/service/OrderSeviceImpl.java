package com.capgemini.restaurant.editmenu.service;

import java.util.List;

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
}
