package com.maxkucher.entityassociations.services;


import com.maxkucher.entityassociations.dto.NoteGroupDto;
import com.maxkucher.entityassociations.entities.NoteGroup;
import com.maxkucher.entityassociations.repositories.NoteGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteGroupService {
    private final NoteGroupRepository repository;

    public NoteGroup createNoteGroup(NoteGroupDto dto) {
        NoteGroup noteGroup = new NoteGroup();
        noteGroup.setName(dto.getName());
        return repository.save(noteGroup);
    }

    public List<NoteGroup> getAllNoteGroups() {
        return repository.findAll();
    }

}
