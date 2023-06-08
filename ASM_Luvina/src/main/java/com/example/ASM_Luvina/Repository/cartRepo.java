package com.example.ASM_Luvina.Repository;

import com.example.ASM_Luvina.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cartRepo extends JpaRepository<Cart,Integer> {
}
