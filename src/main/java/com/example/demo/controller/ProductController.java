package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.sevice.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/getAll")
	public List<Product> getAll(){
		return (List<Product>) productService.findAll();
	}
}
