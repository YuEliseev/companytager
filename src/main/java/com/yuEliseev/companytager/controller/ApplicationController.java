package com.yuEliseev.companytager.controller;

import com.yuEliseev.companytager.client.IndeedClient;
import com.yuEliseev.companytager.service.IndeedService;
import com.yuEliseev.companytager.service.YahooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ApplicationController {
    @Autowired
    private IndeedClient indeedClient;
    @Autowired
    private YahooService yahooService;
    @Autowired
    private IndeedService indeedService;

    @GetMapping("/demoIndeed")
    public String demo(){
        String companyName = "google";

        return indeedService.getTag(companyName);
    }

    @GetMapping("/demoYahoo")
    public String demo1() {
        String companyName = "adidas";

        return yahooService.getTag(companyName);
    }
}
