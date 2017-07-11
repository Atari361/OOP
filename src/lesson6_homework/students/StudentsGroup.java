package lesson6_homework.students;

import lesson6.human.Student;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by pavlo.letskyi on 5/31/2017.
 */
public class StudentsGroup  {

    private Scanner scanner;
    private String groupName;
    private Student[] students;
    private int freeSlot;

    public StudentsGroup(String groupName, int groupSize) {
        scanner = new Scanner(System.in);
        freeSlot = 0;
        this.groupName = groupName;
        students = new Student[groupSize];
        System.out.println("Empty group has been created!\n");
    }

    public void addStudent() {
        if (freeSlot < students.length) {
            System.out.println("Enter Student name");
            String studentName = scanner.next();
            System.out.println("Enter Student surname");
            String studentSurname = scanner.next();
            Student student = new Student(studentName, studentSurname);
            students[freeSlot++] = student;
        } else {
            System.out.println("GROUP IS FULL!\n");
        }
    }

    public void addStudent(Student student) {
        if (freeSlot < students.length) {
            students[freeSlot++] = student;
        } else {
            System.out.println("GROUP IS FULL!\n");
        }
    }

    public void removeStudent() {
        System.out.println("Enter student surname to remove");
        String studentSurname = scanner.next();
        for (int i=0; i < students.length; i++){
            if (students[i].getSurname() == studentSurname){
                students[i] = null;
                if (freeSlot >= 0){
                    swap(i, freeSlot-1);
                }
                --freeSlot;
                System.out.println("\nPASS! Student removed!");
                return;
            }
        }
        System.out.println("\nFAIL! No such student found!");
    }

    public void removeStudent(int studentNumber) {
        students[studentNumber] = null;
        if (freeSlot >= 0){
            swap(studentNumber, freeSlot-1);
        }
        --freeSlot;
    }

    public boolean searchStudent() {
        System.out.println("Enter student surname");
        String studentSurname = scanner.next();
        for (Student stud : students ){
            if (stud.getSurname().equals(studentSurname)){
                System.out.println("PASS! Such student exists!");
                return true;
            }
        }
        System.out.println("FAIL! No such student found!");
        return false;
    }


    public void printGroup(){
        System.out.println("\nGroup: " + groupName + "\nSize: " + students.length);
        for (Student student : students){
            if (student != null) {
                System.out.println("Student: " + student.getName() + " " + student.getSurname());
            } else {
                System.out.println("[Free slot]");
            }
        }
    }


    public void transferStudent(String studentSurname, StudentsGroup groupToTransfer) {
        System.out.println("Select group to transfer");

        for (int i=0; i < students.length; i++){

            if (students[i].getSurname().equals(studentSurname)){
                groupToTransfer.addStudent(students[i]);
                removeStudent(i);
                System.out.println("Student is transferred");
                return;
            }
        }
        System.out.println("Transfer has failed:(");
    }

    public void sortGroupByName(){

        Arrays.sort(students, Student.NameComparator);

        /*
        int left = 0;
        int right = freeSlot-1;
        while (left < right){
            for (int y=left; y<right; y++) {
                if (students[y+1] != null &&
//                        students[y].getSurname().compareTo(students[y+1].getSurname())
                students[y].compareTo(students[y+1])
                > 0) {
                    swap(y, y+1);
                }
            }
            right--;
            for (int y=right; y>left; y--) {
                if (students[y].getSurname().compareTo(students[y-1].getSurname()) < 0) {
                    swap(y, y-1);
                }
            }
            left++;
        }
        */
        System.out.println("Student list sorted!\n");
    }

    private void swap(int a, int b){
        Student tmp = students[a];
        students[a] = students[b];
        students[b] = tmp;
    }

    public String getGroupName() {
        return groupName;
    }
}
