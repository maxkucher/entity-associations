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
public class NoteGroup {
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    protected Long id;

    protected String name;


    @OneToMany(mappedBy = "noteGroup",
            fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST)
    protected Set<Note> notes = new HashSet<>();


}
