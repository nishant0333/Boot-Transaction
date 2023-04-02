package com.example.Demo16TransactionBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo16TransactionBoot.entity.Product;


@Repository
public interface MyProduseRepo extends JpaRepository<Product,Integer> {

}
