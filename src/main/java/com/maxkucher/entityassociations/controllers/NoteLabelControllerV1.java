package com.maxkucher.entityassociations.controllers;


import com.maxkucher.entityassociations.dto.NoteLabelDto;
import com.maxkucher.entityassociations.entities.NoteLabel;
import com.maxkucher.entityassociations.services.NoteLabelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/noteLabels")
public class NoteLabelControllerV1 {
    private final NoteLabelService noteLabelService;


    @GetMapping
    public List<NoteLabel> getNoteLabels() {
        return noteLabelService.getNoteLabels();
    }


    @PostMapping
    public NoteLabel createNoteLabel(@RequestBody NoteLabelDto noteLabelDto) {
        return noteLabelService.createNoteLabel(noteLabelDto);
    }
}
