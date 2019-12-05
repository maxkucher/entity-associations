package com.maxkucher.entityassociations.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class NotePreferences {

    private static final String GENERATOR_NAME = "notePreferencesKeyGenerator";

    @Id
    @GeneratedValue(generator = NotePreferences.GENERATOR_NAME)
    @GenericGenerator(
            name = NotePreferences.GENERATOR_NAME,
            strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(
                    name = "property", value = "note"
            )
    )
    private Long id;

    @NonNull
    protected NoteColor color;

    @Positive
    @NonNull
    protected short fontSize;

    @OneToOne(fetch = FetchType.LAZY,
            optional = false)
    @JsonBackReference
    @PrimaryKeyJoinColumn
    @NonNull
    protected Note note;


}
