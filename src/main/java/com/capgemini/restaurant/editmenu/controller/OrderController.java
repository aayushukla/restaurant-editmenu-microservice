package com.capgemini.restaurant.editmenu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.restaurant.editmenu.entity.Order;
import com.capgemini.restaurant.editmenu.service.OrderService;


@RestController
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/editmenu")
	public ResponseEntity<List<Order>> getAllRestaurants()
	{
		List<Order> menu= service.findAllOrders();
		System.out.println(menu);
		return new ResponseEntity<List<Order>>(menu, HttpStatus.OK);
	}

}
