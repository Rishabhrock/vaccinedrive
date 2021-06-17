package com.sapient.vaccinedrive.utils;

import com.sapient.vaccinedrive.model.EmployeeRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
    List<EmployeeRecord> employeeData;
 }
