package com.maxkucher.entityassociations.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Parent;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Image {

    public Image(String title, String fileName, int width, int height) {
        this.title = title;
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    @Parent
    protected Image image;

    @Column(nullable = false)
    protected String title;
    @Column(nullable = false)
    protected String fileName;
    protected int width;
    protected int height;
}
