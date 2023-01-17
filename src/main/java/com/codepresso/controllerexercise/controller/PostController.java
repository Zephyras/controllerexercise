package com.codepresso.controllerexercise.controller;


import com.codepresso.controllerexercise.dto.PostDto;
import com.codepresso.controllerexercise.service.PostService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@RequestMapping(value = "/post")
public class PostController {


    //PostService 객체 선언
//    PostService postService = new PostService();
    PostService postService;



    //post 서비스의 객체를 통해 id값을 통해 정보값을 가져온다.
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(method = GET)
    public PostDto getPost(@RequestParam Integer id) {
        PostDto result = postService.getPost(id);
        return result;
    }

//    @RequestMapping(method = GET)
//    public String getPost() {
//        return "GET /post";
//    }

    @RequestMapping(method = POST)
    public String savePost(@RequestBody PostDto postDto) {
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());
        return "POST /post";
    }

    @RequestMapping(method = PUT)
    public String UpdatePost() {
        return "PUT /post";
    }

    @RequestMapping(method = DELETE)
    public String deletePost() {
        return "DELETE /post";
    }


}
