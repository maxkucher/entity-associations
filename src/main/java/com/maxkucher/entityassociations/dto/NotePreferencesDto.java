package com.maxkucher.entityassociations.dto;


import com.maxkucher.entityassociations.entities.NoteColor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotePreferencesDto {
    private NoteColor color;
    @Positive
    private short fontSize;
}
