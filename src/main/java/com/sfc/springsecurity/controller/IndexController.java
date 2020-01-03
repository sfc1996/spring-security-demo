package com.sfc.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "index")
public class IndexController {

    @RequestMapping("user")
    @ResponseBody
    public String user(){
    return "user";
    }

    @RequestMapping("other")
    @ResponseBody
    public String other(){
    return "other";
    }

}
