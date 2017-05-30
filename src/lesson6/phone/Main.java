package lesson6.phone;

/**
 * Created by dell on 5/30/2017.
 */
public class Main {

    public static void main(String[] args) {
//        Phone phone = new Phone("iPhone", "Apple");
//        phone.changeSimCard(new Kyivstar());
//        System.out.println(phone.getSimCard().getBalance());
//        phone.getSimCard().refillBalance(50);
//        System.out.println(phone.getSimCard().getBalance());

        DualSimPhone phone = new DualSimPhone("iPhone", "Apple");
        phone.changeSimCard(new Kyivstar(), 0);
        phone.changeSimCard(new Lifecell(), 1);
        phone.printSimCards();


        /*
    написать класс телефон
 марка
 модель
 симкарта
- метод смены симкарты, проверяет установлена ли симкарта, если нет устанавливает,
если есть спрашивает «точно ли установить»

Интерфейс Сим-карта
 - проверка баланса
 - пополнение счета
 - информация про оператора

Классы - реализуют интерфейс симкарта
-Лайфсел
-Вудафон
-Киевстар
- предусмотреть разную стартовую сумму на счете


Создать телефон, подключить симкарту, проверить с телефона
счет, оператора, пополнить счет

реализовать класс  телефона на две симкарты
     */
    }
}
