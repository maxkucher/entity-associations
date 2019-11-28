package com.maxkucher.entityassociations.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Note {

    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    @Column(nullable = false)
    private String content;

    @ElementCollection
    @CollectionTable
    @AttributeOverride(
            name = "filename",
            column = @Column(name = "FNAME", nullable = false)
    )
    protected Set<Image> images = new HashSet<>();


}
