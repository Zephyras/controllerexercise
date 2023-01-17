package com.codepresso.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//View 라고 보통 표현함. 보통 역활은 프런트엔드 개발자가 role 을 가지고 있음.
@Controller
public class HelloController {

    // "/"  ==> localhost:8080 spring 프레임워크 기본 설정이야 나중에 변경도 가능함. uri 명칭으로 함
    @RequestMapping(value = "/")
    public String Hello() {
        return "Heello";
    }
}
