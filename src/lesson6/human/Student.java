package lesson6.human;

import java.util.Comparator;

/**
 * Created by dell on 5/30/2017.
 */
public class Student extends Human implements Comparable<Student> {

    private String name;
    private String surname;
    private String group;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJoinedGroup() {
        return group;
    }

    public void setJoinedGroup(String group) {
        this.group = group;
    }

    @Override
    public void aboutHuman() {

    }

    @Override
    public int compareTo(Student o) {
        return this.getSurname().compareTo(o.getSurname());
    }


    public static Comparator<Student> NameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    };

}
