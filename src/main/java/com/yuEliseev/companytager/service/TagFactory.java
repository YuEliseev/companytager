package com.yuEliseev.companytager.service;

import org.springframework.http.ResponseEntity;
import org.thymeleaf.util.StringUtils;

public class TagFactory {

    public String getIndeedTag(ResponseEntity<String> response){
        String tag = StringUtils.substringAfter(response.toString(), "\"industry\":\"");
        tag = StringUtils.substringBefore(tag, "\"");

        return tag;
    }

    public String getYahooTag(ResponseEntity<String> response){
        String tag = StringUtils.substringAfter(response.toString(), "\"industry\":\"");
        tag = StringUtils.substringBefore(tag, "\"");

        return tag;
    }
}
