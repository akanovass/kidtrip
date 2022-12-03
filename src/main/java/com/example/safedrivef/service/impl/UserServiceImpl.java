package com.example.safedrivef.service.impl;


import com.example.safedrivef.model.RequestTypeFirst;
import com.example.safedrivef.model.RequestTypeSecond;
import com.example.safedrivef.model.Tariff;
import com.example.safedrivef.model.User;
import com.example.safedrivef.repository.*;
import com.example.safedrivef.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private RequestTypeFirstRepository requestTypeFirstRepository;

    // @Autowired
    // private PasswordEncoder passwordEncoder;
    @Autowired
    private RequestTypeSecondRepository requestTypeSecondRepository;

    @Autowired
    private TariffRepository tariffRepository;



    @Override
    public User createUser(String email, String name, String password, String retypePassword) {
        if (password.equals(retypePassword)) {
            User checkUser = userRepository.findByEmail(email);
            if (checkUser == null) {
                User user = new User();
                user.setEmail(email);
                user.setFullName(name);
                user.setPassword(password);
                User newUser = userRepository.save(user);
                if (newUser.getId() != null) {
                    return newUser;
                }
            }

        }
        return null;
    }

    @Override
    public void updatePassword(String oldPassword, String newPassword, String retypeNewPassword) {
        
    }

    @Override
    public User getCurrentUser() {
        return null;
    }


    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "Successfully deleted!";
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

    // @Override
    // public Tariff getUsersTariff() throws NullPointerException {
    // return getCurrentUser().getTariff();
    // }

    @Override
    public List<Tariff> getAllTariffs() {
        return tariffRepository.findAll();
    }

    @Override
    public String addTariff(Tariff tariff) {
        tariffRepository.save(tariff);
        return "Successfully added!";
    }

    @Override
    public String deleteTariffById(Long id) {
        tariffRepository.deleteById(id);
        return "Successfully deleted!";
    }

    @Override
    public Tariff update(Tariff tariff) {
        tariffRepository.save(tariff);
        return tariff;
    }

    @Override
    public List<RequestTypeFirst> getRequestTypeFirst() {
        return requestTypeFirstRepository.findAll();
    }

    @Override
    public String addRequestTypeFirst(RequestTypeFirst requestTypeFirst) {
        int price=0;

        int fiveDayPrice = 10000;
        int distanceKmPrice = 1000;

        int sumOfDays=requestTypeFirst.getSumOfDays();
        int distance=requestTypeFirst.getDistanceKm();

        price=((fiveDayPrice/5)*sumOfDays) + (distanceKmPrice*distance);

        requestTypeFirst.setPrice(price);
        requestTypeFirstRepository.save(requestTypeFirst);

        return "Successfully added! The price is: " + price;
    }

    @Override
    public List<RequestTypeSecond> getRequestTypeSecond() {
        return requestTypeSecondRepository.findAll();
    }

    @Override
    public String addRequestTypeSecond(RequestTypeSecond requestTypeSecond) {
        int price=0;
        int fiveDayPrice = 10000;
        int distanceKmPrice = 1000;

        int sumOfDays=requestTypeSecond.getSumOfDays();
        int distance=requestTypeSecond.getDistanceKm();
        String typeofCar=requestTypeSecond.getCarType();
        if(typeofCar.equals("car")){
            fiveDayPrice=18000;
        }
        else if(typeofCar.equals("minibus")){
            fiveDayPrice=12000;
        }

        price=((fiveDayPrice/5)*sumOfDays) + (distanceKmPrice*distance);

        requestTypeSecond.setPrice(price);
        requestTypeSecondRepository.save(requestTypeSecond);

        return "Successfully added! The price is: " + price;
    }
}