package com.codepresso.controllerexercise.service;
import com.codepresso.controllerexercise.dto.PostDto;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

//@Service
public class PostService {

    //데이터베이스 에서 데이터테이블 쿼리를 만들어준다.
    public PostDto getPost(Integer id){
        System.out.println("find post data from database by" + id);
        System.out.println("validate data from database");
        System.out.println("process data if necessary");
        return new PostDto(id, "title", " this is content", "dhlee");
    }
}
