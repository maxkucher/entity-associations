package com.maxkucher.entityassociations.repositories;

import com.maxkucher.entityassociations.entities.NoteLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteLabelRepository extends JpaRepository<NoteLabel,Long> {
}
