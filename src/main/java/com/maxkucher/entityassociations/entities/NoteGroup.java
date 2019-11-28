package com.maxkucher.entityassociations.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
}
