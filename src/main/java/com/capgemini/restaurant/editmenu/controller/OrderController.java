package com.capgemini.restaurant.editmenu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping("/find")
	public ResponseEntity<Optional<Order>> find()
	{
		Optional<Order> order= service.findDishUsingId(101);
		return new ResponseEntity<Optional<Order>>(order, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/editmenu/{_id}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("_id") Integer _id) {
        service.deleteOrder(_id);
    }
	
	@PostMapping("/addmenu")
	public ResponseEntity<Order> addMenuRestaurant(@RequestBody Order restaurant) {
		System.out.println(restaurant);
		
		Order r = service.addItems(restaurant);
		System.out.println(r);

		return new ResponseEntity<Order>(r, HttpStatus.CREATED);

	}

}
