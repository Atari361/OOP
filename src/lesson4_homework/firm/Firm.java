package lesson4_homework.firm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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

    public Firm(String firmName, long firmMoney, String firmAddress) {
        this.firmMoney = firmMoney;
        this.firmAddress = firmAddress;
        this.firmName = firmName;
        employees.add(new Employee("name", "surname", "dept3", 3000, "06/06/2017"));
        employees.add(new Employee("name", "surname", "dept3", 4000, "04/06/2017"));
        employees.add(new Employee("name", "surname", "dept3", 1000, "02/06/2017"));
        employees.add(new Employee("name", "surname", "dept5", 2000, "12/06/2016"));
        employees.add(new Employee("name", "surname", "dept5", 5000, "10/06/2016"));
    }

    public void printAllEmployees(){
        System.out.println("List of Employees:");
        for (Employee employee : employees){
            System.out.println("Employee: " + employee.getName() + " " + employee.getSurname());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("PersonalAccount: " + employee.getEmployeeMoney());
            System.out.println("JobStartDate: " + employee.getJobStarDate().toString());
            System.out.println("VocationDaysPool: " + employee.getVocationDays());
            System.out.println("=================");
        }
    }
    public void printAllEmployeesBySalary(){
        System.out.println("List of Employees:");
        sortEmployeesBySalary();
        printAllEmployees();
    }
    public void giveSalaryForAll(){
        for (Employee empl : employees){
            if (firmMoney - empl.getSalary() < 0){
                System.out.println("COMPANY IS BANKRUPT");
                return;
            }
            firmMoney -= empl.getSalary();
            empl.addEmployeeMoney(empl.getSalary());
        }
    }
    public void calcVocations(){
        Date sixMonthFromNow = getDateSixMonthFromNow();
        for (Employee empl : employees){
            if (empl.getJobStarDate().after(sixMonthFromNow)) continue;
            calcVocationForEmployee(empl, Calendar.getInstance());
        }
    }

    private Date getDateSixMonthFromNow(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -6);
        return cal.getTime();
    }
    private void calcVocationForEmployee(Employee employee, Calendar cal){
        cal.add(Calendar.MONTH, -1);
        Date date = cal.getTime();
        if (employee.getJobStarDate().before(date)){
            employee.addVocationDays(2);
            calcVocationForEmployee(employee, cal);
        }
        return;
    }
    private void sortEmployeesBySalary() {
        int left = 0;
        int right = employees.size()-1;

        while (left < right){
            for (int y=left; y<right; y++) {
                if (employees.get(y).getSalary() > employees.get(y+1).getSalary()) {
                    swap(y, y+1, employees);
                }
            }
            right--;
            for (int y=right; y>left; y--) {
                if (employees.get(y).getSalary() < employees.get(y-1).getSalary()) {
                    swap(y, y-1, employees);
                }
            }
            left++;
        }
        System.out.println("Student list sorted!\n");
    }
    private void swap(int a, int b, ArrayList<Employee> employees){
        Employee tmp = employees.get(a);
        employees.set(a, employees.get(b));
        employees.set(b, tmp);
    }

}
