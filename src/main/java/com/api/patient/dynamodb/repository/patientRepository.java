package com.api.patient.dynamodb.repository;

import com.api.patient.dynamodb.entity.Person;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface patientRepository extends CrudRepository<Person, String> {
}
