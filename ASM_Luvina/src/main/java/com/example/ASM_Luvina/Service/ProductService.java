package com.example.ASM_Luvina.Service;

import com.example.ASM_Luvina.Entity.Product;
import com.example.ASM_Luvina.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> listAll() {
        return repo.findAll();
    }

    public Product add(Product product) {
        return repo.save(product);
    }

    public Product findById(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }


}
