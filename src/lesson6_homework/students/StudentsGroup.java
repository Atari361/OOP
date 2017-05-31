package lesson6_homework.students;

import lesson6.human.Student;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by pavlo.letskyi on 5/31/2017.
 */
public class StudentsGroup implements StudentsGroupable {

    private String groupName;
    private Student[] students = new Student[5];
    private int freeSlots = students.length;


    public StudentsGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void addStudent(Student student) {
        if (freeSlots > 0) {
            students[--freeSlots] = student;
        } else {
            System.out.println("GROUP IS FULL!");
        }
    }

    @Override
    public void removeStudent(String studentSurname) {
        for (Student stud : students ){
            if (stud.getSurname() == studentSurname){
                stud = null;
                sortGroupByName();
                System.out.println("PASS! Student removed!");
                return;
            }
        }
        System.out.println("FAIL! No such student found!");
    }

    @Override
    public void searchStudent(String studentSurname) {
        for (Student stud : students ){
            if (stud.getSurname() == studentSurname){
                System.out.println("PASS! Such student exists!");
                return;
            }
        }
        System.out.println("FAIL! No such student found!");
    }
    public void sortGroupByName(){


    }
    public void swap(int a, int b){
        Student tmp = students[a];
        students[a] = students[b];
        students[b] = tmp;
    }

}
