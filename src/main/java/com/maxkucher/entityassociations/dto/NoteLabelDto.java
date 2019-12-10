package com.maxkucher.entityassociations.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class NoteLabelDto {
    private String labelName;
    Set<NoteDto> notes = new HashSet<>();
}
