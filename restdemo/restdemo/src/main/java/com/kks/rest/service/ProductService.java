package com.kks.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kks.rest.entity.Product;
import com.kks.rest.repository.ProductRepository;

@Service
public class ProductService
{
	@Autowired
	ProductRepository productRepository;
	
	@Transactional(readOnly=true)
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Product getProductByProductId(String productId)
	{
		Optional<Product> op = productRepository.findById(productId);
		if(op.isPresent())
			return op.get();
		return null;
	}
	
	@Transactional
	public boolean insertOrModifyProduct(Product product)
	{
		return productRepository.save(product) != null;
	} 
	
	@Transactional
	public boolean deleteProductByProductId(String productId)
	{
		long count = productRepository.count();
		productRepository.deleteById(productId);
		return count > productRepository.count();
	}
}
