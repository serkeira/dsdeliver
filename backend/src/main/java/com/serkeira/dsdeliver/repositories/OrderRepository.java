package com.serkeira.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serkeira.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
