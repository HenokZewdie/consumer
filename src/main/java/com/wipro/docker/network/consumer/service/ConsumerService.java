package com.wipro.docker.network.consumer.service;

import com.wipro.docker.network.consumer.model.ConsumerResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumerService {

    RestTemplate restTemplate = new RestTemplate();
    public ConsumerResponse employeeResponse(){
        ConsumerResponse employeeResponse = new ConsumerResponse();
        HttpHeaders headers = new HttpHeaders();
        String url = "http://localhost:9091/allEmployees";
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<ConsumerResponse> responseEntity = null;

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, ConsumerResponse.class);

        } catch (Exception e) {
            System.out.println("#######" + e.getMessage());
        }
        return responseEntity.getBody();
    }
}
