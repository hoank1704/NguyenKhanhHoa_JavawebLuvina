package com.example.ASM_Luvina.RestController;

import com.example.ASM_Luvina.Entity.Cart;
import com.example.ASM_Luvina.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/cart")
public class CartRestController {
    @Autowired
    CartService service;
    @GetMapping("/getAll")
    public List<Cart> getCartList(){
        return service.getAll();
    }
}
