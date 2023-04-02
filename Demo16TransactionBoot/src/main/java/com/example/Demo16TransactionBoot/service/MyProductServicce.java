package com.example.Demo16TransactionBoot.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo16TransactionBoot.entity.Product;
import com.example.Demo16TransactionBoot.repo.MyProduseRepo;


@Service
public class MyProductServicce {

	@Autowired
	MyProduseRepo productRepo;
	
	
	@Transactional
	public void saveProduct() {
		
//		Product pro=new Product();
//		pro.setId(101);
//		pro.setName("Ganesha");
//		
//		productRepo.save(pro);
		
		for(int i=1;i<=10;i++) {
			
			Product product=new Product();
			product.setId(i);
			product.setName("test product "+i);
			productRepo.save(product);
			
			if(i==7) {
				throw new RuntimeException();
			}
			
			
		}
		
		System.out.println("product saved in db");
		
		
	}
}
