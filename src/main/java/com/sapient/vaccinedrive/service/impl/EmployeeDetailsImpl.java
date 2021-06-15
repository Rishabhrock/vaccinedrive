package com.sapient.vaccinedrive.service.impl;

import com.google.gson.Gson;
import com.sapient.vaccinedrive.model.EmployeeRecord;
import com.sapient.vaccinedrive.repository.EmpRepository;
import com.sapient.vaccinedrive.service.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeDetailsImpl implements EmployeeDetails {
//    Logger logger = (Logger) LoggerFactory.getLogger(EmployeeDetailsImpl.class);
    @Autowired
    EmpRepository empRepository;

    public String insertRecord(List<EmployeeRecord> records){

        if(records.size() != 0) {
            records.stream().forEach(emp -> {
                empRepository.save(emp);
            });
        }
        System.out.println("lets see");
        empRepository.save(new EmployeeRecord(2,"test2","test2"));
        return "Recoded";
    }

    public String deleteRecord(List<EmployeeRecord> records){
        records.stream().forEach(emp -> {
            empRepository.deleteById(emp.getEmpId());
        });
        return "Record deleted";
    }

    public String getRecord(){
        List<EmployeeRecord> employeeRecords = empRepository.findAll();
        System.out.println(employeeRecords);
        Gson gson = new Gson();
        String jsonEmployeeList = gson.toJson(employeeRecords);
        return jsonEmployeeList;
    }

    public String EditRecord(List<EmployeeRecord> records){
        return "";
    }

}
