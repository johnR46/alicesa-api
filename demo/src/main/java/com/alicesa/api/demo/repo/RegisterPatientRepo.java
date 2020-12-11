package com.alicesa.api.demo.repo;

import com.alicesa.api.demo.model.RegisterPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterPatientRepo extends JpaRepository<RegisterPatient,Integer> {
}
