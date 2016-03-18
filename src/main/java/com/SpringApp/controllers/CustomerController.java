package com.SpringApp.controllers;

import com.SpringApp.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/*
Аннотация @Controller служит для сообщения Spring'у о том,
 что данный класс является bean'ом и его необходимо подгрузить при старте приложения.
 Аннотацией @RequestMapping(value = "/simple1") сообщаем,
 что данный контроллер будет обрабатывать запрос, URI которого "/simple1"

 Ранее мы рассматривали только методы, которые были помечены аннотацией @RequestMapping.
  Также есть возможность пометить класс с помощью аннотации @RequestMapping.
   Тогда все методы будут получать запросы с URI, который будет начинатся строкой,
   указанной в аннотации @RequestMapping перед объявлением класса контроллера.

*/


/**
 * Created by vitaliiromanchenko on 18.03.16.
 */

@Controller
@RequestMapping("/customers")

public class CustomerController {

    private static List<Customer> list= new ArrayList<Customer>();
    static {
        list.add(new Customer(1l, "John Stokton"));
        list.add(new Customer(2l, "Kobe Bryant"));

    }

    @RequestMapping(value = "", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody

    public List<Customer> getAllCustomers()
    {
        return list;
    }


}
