package com.rita.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rita.jobtracker.entity.StatusHistory;

public interface StatusHistoryRepository extends JpaRepository<StatusHistory, Long> {
}