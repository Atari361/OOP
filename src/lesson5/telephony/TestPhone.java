package lesson5.telephony;

import lesson5.telephony.Life;
import lesson5.telephony.Samsung;

/**
 * Created by dell on 5/29/2017.
 */
public class TestPhone {

    /*
- реализовать 2х наследников класса Phone (Samsung (смартфон) & Nokia(кнопочный))
  и 2х класса Сим-карта (Life & MTC)

- переопределить метод toString который выводит информацию о телефоне и установленной в него симкарте.

- для наследников сим карты реализовать по 2 разные услуги - тарифы(поля)

- для наследников телефона реализовать по 2 разновидности функционала (gps, мп3, камера, точскрин и тд.)

- создать два разных телефона и установить в них симкарты, вывести инф о них в консоль.
     */

    public static void main(String[] args) {
        Samsung samsung = new Samsung("Galaxy", new Life(), "touchscreen");
        System.out.println(samsung);

    }
}
