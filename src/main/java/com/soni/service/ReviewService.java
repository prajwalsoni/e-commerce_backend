package com.soni.service;

import java.util.List; 

import com.soni.exception.ProductException;
import com.soni.modal.Review;
import com.soni.modal.User;
import com.soni.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
