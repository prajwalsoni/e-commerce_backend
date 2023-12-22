package com.soni.service;

import java.util.List; 

import com.soni.exception.ProductException;
import com.soni.modal.Rating;
import com.soni.modal.User;
import com.soni.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
