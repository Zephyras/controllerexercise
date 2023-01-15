package com.codepresso.controllerexercise.controller;

import com.codepresso.controllerexercise.dto.SpecialtyDto;
import com.codepresso.controllerexercise.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

    @RequestMapping(value = "/user")
    public UserDto getUser() {
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java", "Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot","Basic"));

        return new UserDto(1, "Kyowook", "kyowook@gmail.com", specialties);
    }

//    @RequestMapping(value = "/user")
//    public UserDto getUser() {
//        List<String> specialties = new ArrayList<>();
//        specialties.add("Java");
//        specialties.add("Spring Boot");
//
//        return new UserDto(1, "Kyowook", "kyowook@gmail.com", specialties);
//    }
}

//@RestController
//@RequestMapping(value = "/user")
//public class UserController {
//
//    @RequestMapping(value = "/paid")
//    public String getPaidUer() {
//        return "I'm a paid user.";
//    }
//    @RequestMapping(value = "/enterprise")
//    public String getEnterpriseUser() {
//        return "I'm a enterprise user.";
//    }
//}
