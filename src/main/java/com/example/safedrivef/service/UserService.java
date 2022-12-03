package com.example.safedrivef.service;


import com.example.safedrivef.model.RequestTypeFirst;
import com.example.safedrivef.model.RequestTypeSecond;
import com.example.safedrivef.model.Tariff;
import com.example.safedrivef.model.User;
import com.example.safedrivef.repository.RequestTypeSecondRepository;


import java.util.List;

public interface UserService  {

    User createUser(String email, String name, String password, String retypePassword);
    void updatePassword(String oldPassword, String newPassword, String retypeNewPassword);
    User getCurrentUser();
    List<User> allUsers();
    String deleteUser(Long id);
    User updateUser(User user);

   // Tariff getUsersTariff();

    List<Tariff> getAllTariffs();
    String addTariff(Tariff tariff);
    String deleteTariffById(Long id);
    Tariff update(Tariff tariff);

    List<RequestTypeFirst> getRequestTypeFirst();
    String addRequestTypeFirst(RequestTypeFirst requestTypeFirst);

    List<RequestTypeSecond> getRequestTypeSecond();
    String addRequestTypeSecond(RequestTypeSecond requestTypeSecond);


}