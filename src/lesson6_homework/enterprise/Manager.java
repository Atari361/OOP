package lesson6_homework.enterprise;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by letsk on 06/11/2017.
 */
public class Manager extends Employee {

    ArrayList<Employee> subordinates = new ArrayList<>();

    public Manager(String name, Date birthDate, String sex, int salary, String department){
        super(name, birthDate,sex,salary,department);

        setSalary(salary + 50*(subordinates.size() - 1));
    }
}
