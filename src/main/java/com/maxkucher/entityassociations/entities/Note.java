package com.maxkucher.entityassociations.entities;


import lombok.*;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    @Column(nullable = false)
    private String content;

    @ElementCollection
    @CollectionTable
    @CollectionId(generator = "ID_GENERATOR",
            type = @Type(type = "long"),
            columns = @Column(name = "IMAGE_ID"))
    protected Collection<Image> images = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "NOTE_GROUP_ID")
    protected NoteGroup noteGroup;


    @OneToOne(mappedBy = "note", cascade = CascadeType.PERSIST)
    protected NotePreferences preferences;


}
