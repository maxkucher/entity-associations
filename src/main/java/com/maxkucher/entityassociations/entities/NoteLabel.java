package com.maxkucher.entityassociations.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class NoteLabel {
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    protected Long id;

    protected String labelName;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "NOTE_NOTE_LABEL",
            joinColumns = @JoinColumn(name = "NOTE_GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "NOTE_ID")
    )
    @JsonBackReference
    protected Set<Note> notes = new HashSet<>();


}
