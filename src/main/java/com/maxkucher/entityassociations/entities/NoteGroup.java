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
public class NoteGroup {
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    protected Long id;

    protected String name;

    @OneToMany(mappedBy = "noteGroup",
            cascade = CascadeType.PERSIST)
    protected Set<Note> notes = new HashSet<>();

}
