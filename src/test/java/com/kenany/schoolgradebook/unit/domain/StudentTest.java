package com.kenany.schoolgradebook.unit.domain;

import com.kenany.schoolgradebook.domain.Student;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getId() {
        Student student = new Student();
        assertNull(student.getId(), "The student id is null");
        long id = System.currentTimeMillis();
        Student student1 = new Student(id, "slug");
        assertNotNull(student1.getId(), "The student id is not longer null");
        assertEquals(id, student1.getId(), "The student id match with the expected");
    }

    @Test
    void getSlug() {
        Student student = new Student();
        assertNull(student.getSlug(), "The student slug is null");
        String slug = UUID.randomUUID().toString();
        Student student1 = new Student(1l, slug);
        assertNotNull(student1.getSlug(), "The student slug is not longer null");
        assertEquals(slug, student1.getSlug(), "The student slug match with the expected");
    }

    @Test
    void setId() {
        Student student = new Student();
        long id = System.currentTimeMillis();
        assertNull(student.getId(), "The student id is null");
        student.setId(id);
        assertNotNull(student.getId(), "The student id is not longer null");
        assertEquals(id, student.getId(), "The student id match with the id that have been set");
    }

    @Test
    void setSlug() {
        Student student = new Student();
        String slug = UUID.randomUUID().toString();
        assertNull(student.getSlug(), "The student slug is null");
        student.setSlug(slug);
        assertNotNull(student.getSlug(), "The student slug is not longer null");
        assertEquals(slug, student.getSlug(), "The student slug match with the slug that have been set");
    }
}