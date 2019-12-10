package com.maxkucher.entityassociations.services;


import com.maxkucher.entityassociations.dto.NoteDto;
import com.maxkucher.entityassociations.dto.NoteGroupDto;
import com.maxkucher.entityassociations.entities.Note;
import com.maxkucher.entityassociations.entities.NoteGroup;
import com.maxkucher.entityassociations.entities.NotePreferences;
import com.maxkucher.entityassociations.repositories.NoteGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class NoteGroupService {
    private final NoteGroupRepository repository;

    public NoteGroup createNoteGroup(NoteGroupDto dto) {
        NoteGroup noteGroup = new NoteGroup();
        noteGroup.setName(dto.getName());
        Set<Note> notes = new HashSet<>();
        for (NoteDto noteDto : dto.getNotes()) {
            Note note = new Note();
            note.setImages(noteDto.getImages());
            note.setContent(noteDto.getContent());
            if (Objects.nonNull(noteDto.getNotePreferences())) {
                NotePreferences notePreferences = NotePreferences.builder()
                        .color(noteDto.getNotePreferences().getColor())
                        .fontSize(noteDto.getNotePreferences().getFontSize())
                        .build();
                note.setPreferences(notePreferences);
            }
            //FIXME stackoverflow
            note.setNoteGroup(noteGroup);
            notes.add(note);
        }
        noteGroup.getNotes().addAll(notes);
        return repository.save(noteGroup);
    }

    public List<NoteGroup> getAllNoteGroups() {
        return repository.findAll();
    }

}
