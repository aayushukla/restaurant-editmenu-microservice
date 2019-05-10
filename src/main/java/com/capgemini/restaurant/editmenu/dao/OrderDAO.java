package com.capgemini.restaurant.editmenu.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.restaurant.editmenu.entity.Order;

@Repository
public interface OrderDAO extends MongoRepository<Order, Integer>{

}
