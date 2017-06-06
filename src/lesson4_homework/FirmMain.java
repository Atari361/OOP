package lesson4_homework;

import lesson4_homework.firm.Firm;

/**
 * Created by pavlo.letskyi on 6/6/2017.
 */
public class FirmMain {
    public static void main(String[] args) {
        Firm firm = new Firm("Keysurvey", 20000, "Address");
        firm.printAllEmployees();
        System.out.println();
        firm.calcVocations();
        firm.printAllEmployees();
    }
}
