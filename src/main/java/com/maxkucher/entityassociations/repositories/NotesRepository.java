package com.maxkucher.entityassociations.repositories;

import com.maxkucher.entityassociations.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note, Long> {
}
