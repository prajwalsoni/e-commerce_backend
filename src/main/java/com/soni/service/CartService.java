package com.soni.service;

import com.soni.exception.ProductException;
import com.soni.modal.Cart;
import com.soni.modal.CartItem;
import com.soni.modal.User;
import com.soni.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
