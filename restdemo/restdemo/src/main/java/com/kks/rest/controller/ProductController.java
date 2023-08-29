package com.kks.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kks.rest.entity.Product;
import com.kks.rest.service.ProductService;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts()
	{	
		List<Product> plist = productService.getAllProducts(); 
		if(plist.size() != 0)
			return new ResponseEntity<List<Product>>(plist, HttpStatus.OK);
		return new ResponseEntity<List<Product>>(plist, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<Product> getProductByProductId(@PathVariable String productId)
	{
		Product p = productService.getProductByProductId(productId);
		if(p!=null)
			return new ResponseEntity<Product>(p, HttpStatus.OK);
		return new ResponseEntity<Product>(p, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(consumes="application/json")
	public HttpStatus insertProduct(@RequestBody Product product)
	{
		if(productService.insertOrModifyProduct(product))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	
	@PutMapping(consumes="application/json")
	public HttpStatus modifyProduct(@RequestBody Product product)
	{
		if(productService.insertOrModifyProduct(product))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	
	@DeleteMapping("/{productId}")
	public HttpStatus deleteById(@PathVariable String productId)
	{
		if(productService.deleteProductByProductId(productId))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	
	
}
