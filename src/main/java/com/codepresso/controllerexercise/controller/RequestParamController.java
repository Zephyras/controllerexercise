package com.codepresso.controllerexercise.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    //글을 조회할수있는 메소드
    @RequestMapping(value = "/post")
    public String getPost(@RequestParam(required = false, defaultValue = "it") String category,
                           @RequestParam(name = "id")Integer id){
        return "Your requested " + category + " - " + id + "post";
    }

    //path 파라미터 전달하는 메소드
    //uri 패스를 전달하려면 패스배리에이플의 데이터를 메소드의 타입에 저장된다.
    @RequestMapping(value = "/user/{type}/id/{id}")
    public String getUser(@PathVariable(name = "type") String type,
                          @PathVariable(name = "id") Integer id){
        return "You request " + type + " - " + id + " user";
    }
}
