package com.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vitaliiromanchenko on 17.03.16.
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("/Hello")
public class HelloController {

@RequestMapping("")
@ResponseBody
    public String hello(){
    return "Hello World";

}

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public String greetings(String name)
    {
        return "Hola"+ name;

    }
  //  public static void main(String[] args) {
   //     SpringApplication.run(HelloController.class,args);
  //  }


}
