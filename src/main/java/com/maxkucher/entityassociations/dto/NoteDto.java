package com.maxkucher.entityassociations.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.maxkucher.entityassociations.entities.Image;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collection;

@Data
public class NoteDto {

    @NotEmpty
    private String content;

    private Collection<Image> images = new ArrayList<>();

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NotePreferencesDto notePreferences;

}
