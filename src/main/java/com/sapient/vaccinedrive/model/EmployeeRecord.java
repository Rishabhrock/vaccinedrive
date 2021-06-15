package com.sapient.vaccinedrive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collections;

@Document(collection = "EmployeeRecord")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeRecord {
    @Id
    int empId;
    String empName;
    String Email;
}
