package com.example.safedrivef.controller;

import com.example.safedrivef.model.RequestTypeFirst;
import com.example.safedrivef.model.RequestTypeSecond;
import com.example.safedrivef.model.Tariff;
import com.example.safedrivef.model.User;
import com.example.safedrivef.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.allUsers();
        // return ObjectMapperUtils.mapAll(UserService.getAllTariffs(), Tariff.class);
    }

    @PostMapping
    public User save(@RequestParam(name="email") String email,
                        @RequestParam(name="name") String name,
                        @RequestParam(name="password") String password,
                        @RequestParam(name="retypePassword") String retypePassword){
        return userService.createUser(email, name, password, retypePassword);
    }
    @PutMapping
    public User update(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(name = "id") Long id){
        return userService.deleteUser(id);
    }


    @GetMapping("/gettariffs")
    public List<Tariff> get(){
        return userService.getAllTariffs();
        // return ObjectMapperUtils.mapAll(UserService.getAllTariffs(), Tariff.class);
    }

    @PostMapping("/addtariff")
    public String saveT(@RequestBody Tariff tariff){
        userService.addTariff(tariff);
        return "Successfully added!";
    }
    @PutMapping("updatetariff")
    public Tariff updateT(@RequestBody Tariff tariff){
        return userService.update(tariff);
    }

    @DeleteMapping("/deletetariff/{id}")
    public String deleteT(@PathVariable(name = "id") Long id){
        return userService.deleteTariffById(id);
    }

    @PostMapping("/addrequestfirst")
    public String saveR(@RequestBody RequestTypeFirst requestTypeFirst){

        return userService.addRequestTypeFirst(requestTypeFirst);
    }
    @GetMapping("/getrequestsfirs")
    List<RequestTypeFirst> getallrequests(){
        return  userService.getRequestTypeFirst();
    }

    @PostMapping("/addrequestsecond")
    public String saveR2(@RequestBody RequestTypeSecond requestTypeSecond){

        return userService.addRequestTypeSecond(requestTypeSecond);
    }
    @GetMapping("/getrequestssecond")
    List<RequestTypeSecond> getallrequests2(){
        return  userService.getRequestTypeSecond();
    }

}
