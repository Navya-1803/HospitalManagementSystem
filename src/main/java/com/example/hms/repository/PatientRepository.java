package com.example.hms.repository;

import com.example.hms.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository responsible for database operations related to Patient.
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {

}