package com.rita.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rita.jobtracker.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
