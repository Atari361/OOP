package lesson6_homework.students;

import lesson6.human.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pavlo.letskyi on 5/31/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<StudentsGroup> studentsGroups = new ArrayList<>();

        studentsGroups.add(new StudentsGroup("QA", 4));
        studentsGroups.get(0).addStudent(new Student("zorg", "zorg"));
        studentsGroups.get(0).addStudent(new Student("zorg", "jeep"));
        studentsGroups.get(0).addStudent(new Student("zorg", "cook"));
        studentsGroups.get(0).addStudent(new Student("zorg", "poop"));
        studentsGroups.get(0).printGroup();
        studentsGroups.get(0).sortGroupByName();
        studentsGroups.get(0).printGroup();

        /*

        int currentGroup = 0;
        boolean closeAppFlag = true;

        do {
            if (studentsGroups.size() == 0) {
                System.out.println("Creating first group:\n");
                System.out.println("Enter Group Name");
                String groupName = scanner.next();
                System.out.println("Enter group size");
                int groupSize;
                do {
                    if (scanner.hasNextInt()){
                        groupSize = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Please enter valid number!");}
                } while (true);
                studentsGroups.add(new StudentsGroup(groupName, groupSize));
            }
            System.out.println("Current GROUP: " + studentsGroups.get(currentGroup).getGroupName() +
                    "\n\nEnter the number of action:\n" +
                    "1. ADD new group\n" +
                    "2. SWITCH current group\n" +
                    "3. Manage students\n" +
                    "4. MOCK");
            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1: {
                        System.out.println("Enter Group Name");
                        String groupName = scanner.next();
                        System.out.println("Enter group size");
                        int groupSize = scanner.nextInt();
                        studentsGroups.add(new StudentsGroup(groupName, groupSize));
                        break;
                    } case 2: {
                        System.out.println("Choose group number to switch:\n");
                        printGroups(studentsGroups);
                        if (scanner.hasNextInt()) {
                            currentGroup = scanner.nextInt()-1;
                        }
                        break;
                    } case 3: {
                        System.out.println(
                                "Enter the number of action:\n" +
                                        "1 - ADD new student\n" +
                                        "2 - REMOVE student\n" +
                                        "3 - CHECK if student is already in group\n" +
                                        "4 - PRINT students of the group\n" +
                                        "5 - SORT students by their surnames\n" +
                                        "6 - TRANSFER a student to another group\n" +
                                        "7 - Closed app\n");
                        if (scanner.hasNextInt()){
                            switch (scanner.nextInt()) {
                                case 1: {
                                    studentsGroups.get(currentGroup).addStudent();
                                    break;
                                } case 2: {
                                    studentsGroups.get(currentGroup).removeStudent();
                                    break;
                                } case 3: {
                                    studentsGroups.get(currentGroup).searchStudent();
                                    break;
                                } case 4: {
                                    studentsGroups.get(currentGroup).printGroup();
                                    break;
                                } case 5: {
                                    studentsGroups.get(currentGroup).sortGroupByName();
                                    break;
                                }case 6: {
                                    System.out.println("Enter student surname");
                                    String studentSurname = scanner.next();
                                    System.out.println("Select group to transfer");
                                    printGroups(studentsGroups);
                                    studentsGroups.get(currentGroup).transferStudent(studentSurname, studentsGroups.get(scanner.nextInt()-1));
                                    break;
                                } case 7: {
                                    closeAppFlag = false;
                                    break;
                                } default:{
                                    System.out.println("Unknown action number!");
                                }
                            }
                        } else {
                            System.out.println("ACTION FAILED! Please enter valid action number!");
                            scanner.next();
                        }
                        break;
                    }
                    case 4: {
                        for (int i = 0; i < 5; i++) {
                            StudentsGroup group = new StudentsGroup("qa" + i, 5);
                            studentsGroups.add(group);
                            for (int y = 0; y < 5; y++) {
                                group.addStudent(new Student("qa" + y, "qa" + y));
                            }
                        }
                        break;
                    }
                }
            }
        } while (closeAppFlag);

        scanner.close();
        System.out.println("APP Closed.");
    }

    private static void printGroups(ArrayList<StudentsGroup> studentsGroups) {
        int i = 1;
        for (StudentsGroup group : studentsGroups){
            System.out.println(i++ + ". " + group.getGroupName());
        }
    */}


}
