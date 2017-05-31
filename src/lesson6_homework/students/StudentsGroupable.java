package lesson6_homework.students;

import lesson6.human.Student;

/**
 * Created by pavlo.letskyi on 5/31/2017.
 */
public interface StudentsGroupable {

    void addStudent(Student student);
    void removeStudent(String studentSurname);
    void searchStudent(String studentSurname);

}
