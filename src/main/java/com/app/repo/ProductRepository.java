package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
	
	@Query(" select p from Product p where p.prodId=:id ")
	public Product getData(Integer id);
	
	@Query(" select p from Product p where p.prodId=:id ")
	public Optional<Product> getInfo(Integer id);
	
	
	
}
