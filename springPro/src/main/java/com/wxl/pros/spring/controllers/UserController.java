package com.wxl.pros.spring.controllers;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "name", value = "用户详细实体user",paramType = "path",dataType = "String")
    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String queryName(@PathVariable String name){
        return name;
    }
}
