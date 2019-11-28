package com.maxkucher.entityassociations.dto;


import com.maxkucher.entityassociations.entities.Image;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Data
public class NoteDto {

    @Size(min = 1)
    public Set<Image> images = new HashSet<>();
}
