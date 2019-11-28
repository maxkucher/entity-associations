package com.maxkucher.entityassociations.controllers;


import com.maxkucher.entityassociations.dto.NoteDto;
import com.maxkucher.entityassociations.entities.Note;
import com.maxkucher.entityassociations.services.NotesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RequiredArgsConstructor
@RequestMapping("/api/v1/notes")
@RestController
public class NotesControllerV1 {
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
