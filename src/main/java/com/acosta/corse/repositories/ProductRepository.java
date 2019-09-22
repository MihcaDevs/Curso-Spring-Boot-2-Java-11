package com.acosta.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acosta.corse.entities.Category;
import com.acosta.corse.entities.Product;
import com.acosta.corse.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
