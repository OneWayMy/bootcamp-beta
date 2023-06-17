package ru.faang.school.hashmap.task_3.student;

import java.util.Objects;

public class Student {
    private String name;
    private String faculty;
    private int year;

    public Student(String name, String faculty, int year) {
        this.name = name;
        this.faculty = faculty;
        if (year < 1 || year > 4) {
            throw new NumberFormatException();
        }
        this.year = year;
    }

    public GrupStudent facultyYear() {
        return new GrupStudent(faculty, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 4) {
            throw new NumberFormatException();
        }
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, year);
    }

    @Override
    public String toString() {
        return "Student: " + name + " faculty: " + faculty + " Курс: " + year;
    }
}
