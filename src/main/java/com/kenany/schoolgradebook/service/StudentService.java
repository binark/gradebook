package com.kenany.schoolgradebook.service;

import com.kenany.schoolgradebook.domain.Student;

/**
 * The student service interface.
 * Should contains methods to manage student
 *
 * @author kenany (armelknyobe@gmail.com)
 */
public interface StudentService {

    /**
     * Save new student.
     * @param student student to save
     * @return saved student (with id)
     */
    Student save(Student student);
}
