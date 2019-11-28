package com.maxkucher.entityassociations.dto;


import com.maxkucher.entityassociations.entities.Image;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;

@Data
public class NoteDto {

    @Size(min = 1)
    public Collection<Image> images = new ArrayList<>();
}
