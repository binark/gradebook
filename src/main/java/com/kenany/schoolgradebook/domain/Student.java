package com.kenany.schoolgradebook.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * The student entity class.
 * @author kenany
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    /**
     * The student id.
     */
    @Id
    private Long id;

    /**
     * The student slug identifier.
     */
    @Column(unique = true)
    private String slug;
}
