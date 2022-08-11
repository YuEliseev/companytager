package com.yuEliseev.companytager.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "indeed-client", url = "https://www.indeed.com")
public interface IndeedClient {

    @GetMapping(value = "/cmp/{companyName}")
    ResponseEntity<String> getIndeedInfo(@PathVariable("companyName") String companyName);

    // A 403 forbidden means that the server understood the request but refuses authorization so that could be a permissions issue..
}