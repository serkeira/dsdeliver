package com.serkeira.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.serkeira.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	// deve ser exatamente igual o nome da CLASSE 
	// o obj.products se refere a própria lista que se encontra na classe
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC ")
	List<Order> findOrdersWithProducts();
	

}
