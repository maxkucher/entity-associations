package com.maxkucher.entityassociations.repositories;


import com.maxkucher.entityassociations.entities.NoteGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteGroupRepository extends JpaRepository<NoteGroup, Long> {
}
