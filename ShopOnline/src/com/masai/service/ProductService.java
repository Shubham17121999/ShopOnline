package com.masai.service;

import java.util.List;
import java.util.Map;

import com.masai.entities.Customer;
import com.masai.entities.Product;
import com.masai.entities.Transaction;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.ProductException;
import com.masai.exceptions.TransactionException;

public interface ProductService {

	public String addProduct(Product pro, Map<Integer, Product> products);

	public void viewAllProducts(Map<Integer, Product> products) throws ProductException;

	public void deleteProduct(int id, Map<Integer, Product> products) throws ProductException;

	public String updateProduct(int id, Product prod, Map<Integer, Product> products) throws ProductException;

	
	
}
