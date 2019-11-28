package com.maxkucher.entityassociations.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Image {
    @Column(nullable = false)
    protected String title;
    @Column(nullable = false)
    protected String fileName;
    protected int width;
    protected int height;
}
