package com.yuEliseev.companytager.service;

import com.yuEliseev.companytager.client.IndeedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndeedService {

    @Autowired
    private IndeedClient indeedClient;

    TagFactory tagFactory = new TagFactory();

    public String getTag(String companyName){
        return tagFactory.getIndeedTag(indeedClient.getIndeedInfo(companyName));
    }
}
