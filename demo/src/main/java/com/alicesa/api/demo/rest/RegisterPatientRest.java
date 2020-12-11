package com.alicesa.api.demo.rest;

import com.alicesa.api.demo.ResourceNotFoundException;
import com.alicesa.api.demo.model.RegisterPatient;
import com.alicesa.api.demo.repo.RegisterPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/alicesa-api")
public class RegisterPatientRest {

    @Autowired
    RegisterPatientRepo registerPatientRepo;

    @GetMapping("/register-patients")
    public ResponseEntity<List<RegisterPatient>> getAllEmployees() {
        return ResponseEntity.ok(registerPatientRepo.findAll());
    }

    @GetMapping("/register-patient/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable(value = "id") Integer idRegisterPatient)
            throws ResourceNotFoundException {
        RegisterPatient registerPatient = registerPatientRepo.findById(idRegisterPatient)
                .orElseThrow(() -> new ResourceNotFoundException("registerPatient not found for this id :: " + idRegisterPatient));
        return ResponseEntity.ok().body("registerPatient not found");
    }
}
