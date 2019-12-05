package com.maxkucher.entityassociations.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotePreferences {


    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    protected NoteColor color;

    @Positive
    protected short fontSize;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST,
            optional = false)
    @JoinTable(name = "NOTE_NOTE_PREFERENCES",
            joinColumns = @JoinColumn(name = "PREFERENCE_ID"),
            inverseJoinColumns = @JoinColumn(name = "NOTE_ID",
                    unique = true,
                    nullable = false))
    @JsonBackReference
    protected Note note;


}
