package lesson4_homework.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by pavlo.letskyi on 5/29/2017.
 */
public class Firm {
    /* Написать класс фирма (hw2.Firm), содержащий имя, адрес, заплатанный счет (сумма), сотрудников.
У каждого сотрудника (hw2.Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный
карточный счет (сумма), год поступления на работу, месяц поступления на работу, пол, отдел.
Класс фирма должен выполнять следующие функции:
— Вывести всех сотрудников фирмы на экран (метод void printAllEmployees())
— Вывести на экран всех сотрудников, отсортированных по зарплате (шейкерным методом)
— Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника,
с главного счета фирмы) (метод void giveSalaryForAll())
— Пересчитать всем сотрудникам дни отпуска (всем кто проработал больше 6 месяцев, по 2 дня за каждый отработанный месяц) (метод void calcVocations())
     */
    String firmName;
    String firmAddress;
    long firmMoney;
    ArrayList<Employee> employees = new ArrayList<>();

    public void printAllEmployees(){
        System.out.println("List of Employees:");
        for (Employee employee : employees){
            System.out.println("FIO: " + employee.getName() + " " + employee.getSurname());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("=================");
        }
    }
    public void printAllEmployeesBySalary(){
        System.out.println("List of Employees:");
        for (Employee employee : employees){
            System.out.println("FIO: " + employee.getName() + " " + employee.getSurname());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("=================");
        }
    }

}
