package com.sapient.vaccinedrive.repository;

import com.sapient.vaccinedrive.model.EmployeeRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpRepository extends MongoRepository<EmployeeRecord,Integer> {

    @Override
    Optional<EmployeeRecord> findById(Integer integer);
}
