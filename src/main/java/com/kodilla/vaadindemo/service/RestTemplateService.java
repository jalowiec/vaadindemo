package com.kodilla.vaadindemo.service;


import elemental.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {


    RestTemplate restTemplate;
    HttpHeaders headers;


    public String sendRouteRequest(JsonObject jsonFromForm){

        restTemplate = new RestTemplate();
        headers = new HttpHeaders();
        JsonObject jsonObject;

        final String uri = "http://localhost:9090/v1/routeRequest";

        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<String>(jsonFromForm.toString() ,headers);
        restTemplate.postForObject(uri, request, String.class );

        return "route";

    }

}
