package com.yunxin.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunxin.test.Test1;

/**
 * Created by henryzhou on 17/2/14.
 */
@RestController
@EnableAutoConfiguration
public class SayHi {
	
	@Autowired
	private Test1 t;

    @RequestMapping("/SayHi")
    public String SaHi(){
    	t.say();
        return "12312313";
    }
}
