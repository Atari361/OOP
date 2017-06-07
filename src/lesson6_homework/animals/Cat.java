package lesson6_homework.animals;

/**
 * Created by pavlo.letskyi on 6/6/2017.
 */
public class Cat {

    String name;
    boolean isHairRisen = false;
    boolean isFed = false;
/*Кошка должна уметь:
— Вывести на экран имя, метод void printName()
— Подать голос, метод void say()
— Поднимать шерсть дыбом, метод void riseHair()
— Питаться, метод void eat()
— Орать если ненаелась, метод void yellIfNotGorged()*/

    public void printName(){
        System.out.println(name);
    }

    public void say(){
        System.out.println("VOICE");
    }

    public void riseHair(){
        isHairRisen = true;
        System.out.println("HAIR RISEN");
    }

    public void eat(){
        System.out.println("EATING");
    }

    public void yellIfNotGorged(){
        if (!isFed){
            System.out.println("YELLING! Feed me!");
        }
    }

}
