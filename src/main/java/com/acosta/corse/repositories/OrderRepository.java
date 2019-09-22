package com.acosta.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acosta.corse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
