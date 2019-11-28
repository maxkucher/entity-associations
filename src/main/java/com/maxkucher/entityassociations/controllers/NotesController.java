package com.maxkucher.entityassociations.controllers;


import com.maxkucher.entityassociations.dto.NoteDto;
import com.maxkucher.entityassociations.entities.Note;
import com.maxkucher.entityassociations.services.NotesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RequiredArgsConstructor
@RestController
public class NotesController {
    private final NotesService notesService;

    @GetMapping
    public Collection<Note> getNotes() {
        return notesService.getAllNotes();
    }


    @PostMapping
    public Note createNote(@RequestBody NoteDto noteDto) {
        return notesService.createNote(noteDto);
    }

}
