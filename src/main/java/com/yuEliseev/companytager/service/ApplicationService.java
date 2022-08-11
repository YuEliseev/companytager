package com.yuEliseev.companytager.service;

import com.yuEliseev.companytager.client.IndeedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    private IndeedClient indeedClient;

}
