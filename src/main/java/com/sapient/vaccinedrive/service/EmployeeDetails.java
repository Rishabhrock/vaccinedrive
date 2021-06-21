package com.sapient.vaccinedrive.service;

import com.sapient.vaccinedrive.model.EmployeeRecord;
import com.sapient.vaccinedrive.model.VaccinatedEmployeeDetails;

import java.util.List;

public interface EmployeeDetails {
    public String insertRecord(List<EmployeeRecord> records);
    public String deleteRecord(List<EmployeeRecord> records);
    public String getRecord();
    public String getAllNonVaccinatedUsers(List<VaccinatedEmployeeDetails> getAllUser);
    public String EditRecord(List<EmployeeRecord> records);
}
