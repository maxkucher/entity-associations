package com.maxkucher.entityassociations.services;


import com.maxkucher.entityassociations.dto.NoteDto;
import com.maxkucher.entityassociations.entities.Note;
import com.maxkucher.entityassociations.entities.NotePreferences;
import com.maxkucher.entityassociations.repositories.NotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NotesService {

    private final NotesRepository notesRepository;

    public List<Note> getAllNotes() {
        return notesRepository.findAll();
    }

    public Note createNote(NoteDto noteDto) {
        Note note = new Note(noteDto);

        return notesRepository.save(note);
    }
}
