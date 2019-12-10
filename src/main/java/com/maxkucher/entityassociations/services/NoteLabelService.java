package com.maxkucher.entityassociations.services;


import com.maxkucher.entityassociations.dto.NoteDto;
import com.maxkucher.entityassociations.dto.NoteLabelDto;
import com.maxkucher.entityassociations.entities.Note;
import com.maxkucher.entityassociations.entities.NoteLabel;
import com.maxkucher.entityassociations.repositories.NoteLabelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class NoteLabelService {
    private final NoteLabelRepository repository;


    public List<NoteLabel> getNoteLabels() {
        return repository.findAll();
    }


    public NoteLabel createNoteLabel(NoteLabelDto dto) {
        NoteLabel noteLabel = NoteLabel.builder()
                .labelName(dto.getLabelName())
                .build();
        for (NoteDto noteDto : dto.getNotes()) {
            Note note = new Note(noteDto);
            note.getNoteLabels().add(noteLabel);
            noteLabel.getNotes().add(note);
        }

        return repository.save(noteLabel);
    }
}
