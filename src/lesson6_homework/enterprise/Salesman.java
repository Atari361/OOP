package lesson6_homework.enterprise;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by letsk on 06/11/2017.
 */
public class Salesman extends Employee {

    private int sales;

    public Salesman(String name, Date birthDate, String sex, int salary, String department){
        super(name, birthDate,sex,salary,department);
        setSalary((int)Math.round(salary + sales*0.3));
    }

}
