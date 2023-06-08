package com.example.ASM_Luvina.RestController;

import com.example.ASM_Luvina.Entity.User;
import com.example.ASM_Luvina.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/user")
public class UserRestController {
    @Autowired
    UserService service;
    @GetMapping("/getAll")
    public List<User> getAll(){
        return service.findAll();
    }
    @PostMapping("/add")
    public User add(@RequestBody User user){
        return service.save(user);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")Integer id){
        service.delete(id);
    }
    @GetMapping("/getById/{id}")
    public User getById(@PathVariable("id")Integer id){
        return service.findById(id);
    }
}
