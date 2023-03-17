package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==> "+id);
        System.out.println("id2 ==> "+id);

        return "hello , spring boot!";
    }

    @GetMapping()
    public String getAll2(){
        System.out.println("id ==>");
        return "hello2";
    }
}
