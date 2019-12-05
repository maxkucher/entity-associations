package com.maxkucher.entityassociations.dto;


import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class NoteGroupDto {
    private String name;
    Set<NoteDto> notes = new HashSet<>();
}
