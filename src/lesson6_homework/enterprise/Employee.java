package lesson6_homework.enterprise;

import java.util.Date;

/**
 * Created by letsk on 06/11/2017.
 */
public class Employee {

    private String name;
    private Date birthDate;
    private String sex;
    private int salary;
    private String department;
    private int employeeMoney = 0;
    private int experience = 0;
    private int vocationDays = 0;
    private Date lastVocationDate;

    public Employee(String name, Date birthDate, String sex, int salary, String department) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
