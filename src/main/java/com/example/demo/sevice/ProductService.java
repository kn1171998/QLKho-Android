package com.example.demo.sevice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepos;

@Service
public class ProductService {
	@Autowired
	ProductRepos productRepos;
	public Iterable<Product> findAll(){
		return productRepos.findAll();
	}
	
}
