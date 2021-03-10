package com.wipro.docker.network.consumer.model;

import lombok.Data;

import java.util.List;

@Data
public class ConsumerResponse {
    public String status;
    public List<EmployeeInfo> data;
}
