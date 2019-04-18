package com.hui.springdemo.spring;


import com.hui.springdemo.model.AuthResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthorController {
    @Autowired
    private AuthResposity authResposity;

    @GetMapping("getAll")
    public Object getAllList(@PageableDefault(page = 0, size = 5, sort = {"id"}) Pageable pageable) {

        return authResposity.findAll((pageable));
    }
}
