package com.maxkucher.entityassociations.controllers;


import com.maxkucher.entityassociations.dto.NoteGroupDto;
import com.maxkucher.entityassociations.entities.NoteGroup;
import com.maxkucher.entityassociations.services.NoteGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/noteGroup")
@RequiredArgsConstructor
public class NoteGroupsControllerV1 {
    private final NoteGroupService noteGroupService;

    @GetMapping
    public List<NoteGroup> getAllNotesGroups() {
        return noteGroupService.getAllNoteGroups();
    }

    @PostMapping
    public NoteGroup createNoteGroup(@RequestBody NoteGroupDto noteGroup) {
        return noteGroupService.createNoteGroup(noteGroup);
    }
}
