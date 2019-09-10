package com.kodilla.vaadindemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {


    RestTemplate restTemplate = new RestTemplate();


    public String sendRouteRequest(){

        final String uri = "http://localhost:9090/v1/routeRequest";
        HttpEntity<String> request = new HttpEntity<>(new String());
        restTemplate.postForObject(uri, request, String.class );
        return "route";

    }

}
