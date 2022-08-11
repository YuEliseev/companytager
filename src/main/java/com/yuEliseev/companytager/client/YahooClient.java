package com.yuEliseev.companytager.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "yahoo-client", url = "https://finance.yahoo.com")
public interface YahooClient {

    @GetMapping(value = "/quote/{symbols}")
    ResponseEntity<String> getYahooInfo(@PathVariable("symbols") String symbols);

    @GetMapping(value = "/lookup")
    ResponseEntity<String> getYahooLookup(@RequestParam("s") String companyName);
}
