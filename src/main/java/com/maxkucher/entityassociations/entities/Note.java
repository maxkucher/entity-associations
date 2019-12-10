package com.maxkucher.entityassociations.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
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
    @JoinTable(
            name = "NOTE_NOTE_GROUP",
            joinColumns = @JoinColumn(name = "NOTE_ID"),
            inverseJoinColumns = @JoinColumn(name = "NOTE_GROUP_ID")
    )
    @JsonBackReference
    protected NoteGroup noteGroup;


    @OneToOne(mappedBy = "note", cascade = CascadeType.PERSIST)
    protected NotePreferences preferences;


    @ManyToMany(mappedBy = "notes")
    protected Set<NoteLabel> noteLabels = new HashSet<>();


}
