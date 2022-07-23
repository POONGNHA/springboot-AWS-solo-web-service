package com.jojoldu.book.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 객체 데이터를 JSON형식으로 반환해줌
public class HelloController {
    @GetMapping("/hello") // http method인 Get의 요청을 받을수 있는 API를 만들어준다. (Application programming interface = 통신 규정)
    public String hello(){
        return "hello";
    }
}
