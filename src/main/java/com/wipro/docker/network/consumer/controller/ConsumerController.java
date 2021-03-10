package com.wipro.docker.network.consumer.controller;

import com.wipro.docker.network.consumer.model.ConsumerResponse;
import com.wipro.docker.network.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    ConsumerService employeeService = new ConsumerService();

    @RequestMapping(value = "/consumerEmployees", method = RequestMethod.GET)
    public ConsumerResponse allEmployeesMethod() {
        ConsumerResponse employeeResponse = employeeService.employeeResponse();
        return employeeResponse;
    }
}
