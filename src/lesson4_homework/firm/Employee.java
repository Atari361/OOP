package lesson4_homework.firm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pavlo.letskyi on 5/29/2017.
 */
public class Employee {
    private String name;
    private String surname;
    private String sex;
    private String department;
    private int salary;
    private int employeeMoney = 0;
    private Date jobStarDate;
    private int vocationDaysPool = 0;

    public Employee(String name, String surname, String department, int salary, String jobStarDate) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        try {
            this.jobStarDate = df.parse(jobStarDate);
        } catch (ParseException e) {
            System.out.println("Incorrect date format for Employee jobStarDate");
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Date getJobStarDate() {
        return jobStarDate;
    }

    public int getVocationDays() {
        return vocationDaysPool;
    }

    public void addVocationDays(int vocationDaysPool) {
        this.vocationDaysPool += vocationDaysPool;
    }

    public int getEmployeeMoney() {
        return employeeMoney;
    }

    public void addEmployeeMoney(int employeeMoney) {
        this.employeeMoney += employeeMoney;
    }
}
