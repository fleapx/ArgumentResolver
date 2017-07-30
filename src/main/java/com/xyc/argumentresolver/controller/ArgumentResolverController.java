package com.xyc.argumentresolver.controller;

import com.xyc.argumentresolver.annotation.RequestDateParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by xyc on 2017/7/27 0027.
 */
@RestController
@RequestMapping("/argumentResolver")
public class ArgumentResolverController {
    @RequestMapping(value = "/requestDateParamTest", method = RequestMethod.GET)
    public String requestDateParamTest(@RequestDateParam Date date) {
        System.out.println(date);
        return "success value is " + date;
    }
}
