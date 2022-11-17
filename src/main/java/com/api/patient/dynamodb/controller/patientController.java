package com.api.patient.dynamodb.controller;

import com.api.patient.dynamodb.entity.Person;
import com.api.patient.dynamodb.repository.patientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/person")
public class patientController {

    private final patientRepository _patientRepository;

    public patientController(patientRepository _patientRepository) {
        this._patientRepository = _patientRepository;
    }

    @GetMapping()
    public List<Person> GetPerson(){
        return (List<Person>)_patientRepository.findAll();
    }

    @GetMapping("{id}")
    public Person GetPersonById(@PathVariable("id") String id){
        Optional<Person> person = _patientRepository.findById(id);
        return person.get();
    }

    @PostMapping()
    public Person CreatePerson(@RequestBody Person person){
        return _patientRepository.save(person);
    }
}
