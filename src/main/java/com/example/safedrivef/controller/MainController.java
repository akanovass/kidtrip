package com.example.safedrivef.controller;

import com.example.safedrivef.model.Tariff;
import com.example.safedrivef.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/tariff")
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Tariff> getAll(){
        return userService.getAllTariffs();
        // return ObjectMapperUtils.mapAll(UserService.getAllTariffs(), Tariff.class);
    }

    @PostMapping
    public String save(@RequestBody Tariff tariff){
        return userService.addTariff(tariff);
    }
    @PutMapping
    public Tariff update(@RequestBody Tariff tariff){
        return userService.update(tariff);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathParam("id") Long id){
        return userService.deleteTariffById(id);
    }


}
