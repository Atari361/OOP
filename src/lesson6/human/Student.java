package lesson6.human;

/**
 * Created by dell on 5/30/2017.
 */
public class Student extends Human {

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
    public void aboutHuman(){

    }
}
