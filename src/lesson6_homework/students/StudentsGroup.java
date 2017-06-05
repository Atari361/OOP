package lesson6_homework.students;

import lesson6.human.Student;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pavlo.letskyi on 5/31/2017.
 */
public class StudentsGroup implements StudentsGroupable {

    private Scanner scanner;
    private String groupName;
    private Student[] students;
    private int freeSlot;

    public StudentsGroup() {
        this.scanner = new Scanner(System.in);
        this.freeSlot = 0;
        this.scanner = new Scanner(System.in);
        System.out.println("Enter Group Name");
        groupName = scanner.next();
        System.out.println("Enter group size");
        do {
            if (scanner.hasNextInt()){
                this.students = new Student[scanner.nextInt()];
                break;
            } else {
                System.out.println("Please enter valid number!");}
        } while (true);
        System.out.println("Empty group has been created!\n");
    }

    @Override
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

    @Override
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

    @Override
    public void searchStudent() {
        System.out.println("Enter student surname to search");
        String studentSurname = scanner.next();
        for (Student stud : students ){
            if (stud.getSurname().equals(studentSurname)){
                System.out.println("PASS! Such student exists!");
                return;
            }
        }
        System.out.println("FAIL! No such student found!");
    }

    public void printGroup(){
        System.out.println("\nGroup: " + groupName + "\nStudents:");
        for (Student student : students){
            if (student != null) {
                System.out.println("FIO: " + student.getName() + " " + student.getSurname());
            } else {
                System.out.println("[Free slot]");
            }
        }
    }

    public void sortGroupByName(){
        int left = 0;
        int right = freeSlot-1;

        while (left < right){
            for (int y=left; y<right; y++) {
                if (students[y+1] != null && students[y].getSurname().compareTo(students[y+1].getSurname()) > 0) {
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
        System.out.println("Student list sorted!\n");
    }

    private void swap(int a, int b){
        Student tmp = students[a];
        students[a] = students[b];
        students[b] = tmp;
    }

}
