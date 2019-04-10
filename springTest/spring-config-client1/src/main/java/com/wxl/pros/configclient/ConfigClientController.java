package com.wxl.pros.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chao on 2017-11-8.
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${profiles}")
    private String profile;

    @Value("${common2}")
    private String common;

    @GetMapping("/getProfile")
    public String hello(){
        return this.profile+"common:"+this.common;
    }
}