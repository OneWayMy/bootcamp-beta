package ru.faang.school.hashmap.task_3.student;

import java.util.Objects;

public class GrupStudent {
    private final String faculty;
    private final int year;

    public GrupStudent(String faculty, int year) {
        this.faculty = faculty;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrupStudent that = (GrupStudent) o;
        return year == that.year && Objects.equals(faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, year);
    }

    @Override
    public String toString() {
        return "Фаакультет: " + faculty + " курс: " + year;
    }
}
