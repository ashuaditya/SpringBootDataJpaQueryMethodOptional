package com.app.runner;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		
		Product p = repo.getData(10);
		System.out.println(p);
		System.out.println(p.getProdCode());
		System.out.println("==================================");
		Optional<Product> prd = repo.getInfo(100);
		if(prd.isPresent())
		{
			Product pr = prd.get();
			System.out.println(pr);
			
		}
		else
		{
			System.out.println("Data Not Found");
		}
		
	}

}
