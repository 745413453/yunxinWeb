package com.yunxin.main;

import com.yunxin.test.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by henryzhou on 17/2/14.
 */
@RestController
@EnableAutoConfiguration
public class SayHi {

    @Autowired
    Test1 test1;

    @RequestMapping("/SayHi")
    public String SaHi(){
        return Test1.str;
    }
}
