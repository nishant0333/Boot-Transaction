package com.example.Demo16TransactionBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo16TransactionBoot.service.MyProductServicce;

@RestController
public class MyProductController {

	@Autowired
	MyProductServicce productServicce;

	@PostMapping("/home")
	public String home() {
		productServicce.saveProduct();
		return "Hello";
	}
}
