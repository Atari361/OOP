package lesson6_homework.students;

import lesson6.human.Student;

/**
 * Created by pavlo.letskyi on 5/31/2017.
 */
public class Main {

    public static void main(String[] args) {
        StudentsGroup group = new StudentsGroup("QA");
        group.addStudent(new Student("name", "aaa"));
        group.addStudent(new Student("name", "ccc"));
        group.addStudent(new Student("name", "bbb"));
        group.addStudent(new Student("name", "zzz"));
        group.addStudent(new Student("name", "ddd"));
        group.addStudent(new Student("name", "fff"));
        group.removeStudent("ddd");
        group.addStudent(new Student("name", "surname6"));
        group.searchStudent("surname5");
        group.searchStudent("bla");
    }
}
