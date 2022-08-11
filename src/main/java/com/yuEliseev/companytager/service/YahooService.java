package com.yuEliseev.companytager.service;

import com.yuEliseev.companytager.client.YahooClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
public class YahooService {

    @Autowired
    private YahooClient yahooClient;

    TagFactory tagFactory = new TagFactory();

    public String getTag(String companyName){

        String symbols = this.getCompanySymbols(yahooClient.getYahooLookup(companyName));

        return tagFactory.getYahooTag(yahooClient.getYahooInfo(symbols));
    }

    public String getCompanySymbols(ResponseEntity<String> response){

        String symbols = StringUtils.substringAfter(response.toString(), "<a href=\"/quote/");
        symbols = StringUtils.substringBefore(symbols, "\" ");

        return symbols;
    }
}
