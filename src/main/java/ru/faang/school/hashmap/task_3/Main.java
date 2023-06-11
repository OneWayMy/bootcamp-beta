package ru.faang.school.hashmap.task_3;


import ru.faang.school.hashmap.task_3.student.GrupStudent;
import ru.faang.school.hashmap.task_3.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final List<Student> listStudents = new ArrayList<>();

    public static void main(String[] args) {
        addStudent("pavel", "kiber", 1);
        addStudent("alexei", "kiber", 1);
        addStudent("sasha", "kiber", 4);
        addStudent("stepan", "freza", 1);
        addStudent("dima", "freza", 3);
        addStudent("ilia", "freza", 3);

        deleteStudent("ilia", "freza", 3);

        searchAllStudent("freza", 3).forEach(System.out::println);

        allStudent();
    }

    private static void addStudent(String name, String faculty, int year) {
        listStudents.add(new Student(name, faculty, year));
    }

    private static void deleteStudent(String name, String faculty, int year) {
        listStudents.remove(new Student(name, faculty, year));
    }

    private static List<Student> searchAllStudent(String faculty, int year) {
        GrupStudent grupStudent = new GrupStudent(faculty, year);
        return getMapGrupFacultyYear().get(grupStudent);
    }

    private static void allStudent() {
        getMapGrupFacultyYear().forEach((key, value) -> {
            System.out.println(key.toString());
            for (Student student : value) {
                System.out.printf("%s \n", student.toString());
            }
        });
    }

    private static Map<GrupStudent, List<Student>> getMapGrupFacultyYear() {
        Map<GrupStudent, List<Student>> mapGrupFacultyYear = new HashMap<>();
        for (Student listStudent : listStudents) {
            List<Student> studentsYearFaculty = new ArrayList<>();
            if (!mapGrupFacultyYear.containsKey(listStudent.facultyYear())) {
                mapGrupFacultyYear.put(listStudent.facultyYear(), studentsYearFaculty);
                mapGrupFacultyYear.get(listStudent.facultyYear()).add(listStudent);
            } else {
                mapGrupFacultyYear.get(listStudent.facultyYear()).add(listStudent);
            }
        }
        return mapGrupFacultyYear;
    }
}
