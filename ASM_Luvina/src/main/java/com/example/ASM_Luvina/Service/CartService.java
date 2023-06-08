package com.example.ASM_Luvina.Service;

import com.example.ASM_Luvina.Entity.Cart;
import com.example.ASM_Luvina.Repository.cartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    cartRepo cartRepo;
    public List<Cart> getAll(){
        return cartRepo.findAll();
    }
}
