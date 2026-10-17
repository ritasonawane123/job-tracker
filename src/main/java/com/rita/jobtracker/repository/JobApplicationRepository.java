package com.rita.jobtracker.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rita.jobtracker.entity.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
    Optional<JobApplication> findByIdAndUserId(Long id, Long userId);
}
