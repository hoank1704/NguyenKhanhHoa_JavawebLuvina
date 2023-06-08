package com.example.ASM_Luvina.RestController;

import com.example.ASM_Luvina.Entity.Product;
import com.example.ASM_Luvina.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rest/product")
public class ProductRestController {
    @Autowired
    ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getALL() {
        return productService.listAll();
    }

    @GetMapping("/getByID/{id}")
    public Product getProdById(@PathVariable("id") int id) {
        Product pro = productService.findById(id);
        return pro;
    }

    @PostMapping("/add")
    public Product createProduct(@RequestBody Product pro)  {
           return productService.add(pro);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
       productService.delete(id);
    }
}