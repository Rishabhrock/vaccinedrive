package com.sapient.vaccinedrive.service;

import com.sapient.vaccinedrive.model.VaccinatedEmployeeDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "USER-CLIENT", url = "http://localhost:8092/vaccine-api")
public interface Micro2FeingClient {

    @RequestMapping(method = RequestMethod.GET, value = "/allEmployee")
    List<VaccinatedEmployeeDetails> getUsers();
}