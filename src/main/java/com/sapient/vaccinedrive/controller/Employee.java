package com.sapient.vaccinedrive.controller;

import java.util.List;

import com.sapient.vaccinedrive.utils.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.vaccinedrive.model.EmployeeRecord;
import com.sapient.vaccinedrive.service.impl.EmployeeDetailsImpl;

@RestController
public class Employee {

    @Autowired
    EmployeeDetailsImpl employeeDetailsImpl;

    @PostMapping(value = "/saveRecord",consumes = MediaType.APPLICATION_JSON_VALUE)
    public 	ResponseEntity<String> insertRecord(@RequestBody EmployeeRequest request){
        String insert=employeeDetailsImpl.insertRecord(request.getEmployeeData());
        return new ResponseEntity<String>(insert,HttpStatus.OK);

    }

    @GetMapping("/getRecord")
    public ResponseEntity<String> getRecord() {
        String getRecord=employeeDetailsImpl.getRecord();
        return new ResponseEntity<String>(getRecord,HttpStatus.OK);

    }
    @DeleteMapping(value = "/delete",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteRecord(@RequestBody EmployeeRequest request) {
        String delete=employeeDetailsImpl.deleteRecord(request.getEmployeeData());
        return new ResponseEntity<String>(delete,HttpStatus.OK);
    }
}
