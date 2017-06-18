package lesson9_homework;

import lesson7.collections.Stack;
import lesson9.collections.Queue;

/**
 * Created by letsk on 06/18/2017.
 */
public interface Deque extends Queue, Stack {

    void addFirst(Integer element);
    //Добавляет новый элемент в начало очереди

    void addLast(Integer element);
    //Добавляет новый элемент в конец очереди

    boolean offerFirst(Integer element);
    //Добавляет новый элемент в начало очереди, при этом если добавление прошло успешно возвращает значение true, иначе false

    boolean offerLast(Integer element);
    //Добавляет новый элемент в конец очереди, при этом если добавление прошло успешно возвращает значение true, иначе false

    Integer peekFirst();
    //Возвращает элемент без удаления из начала очереди.

    Integer peekLast();
    //Возвращает элемент без удаления из хвоста очереди.

    Integer pollFirst();
    //Возвращает и удаляет элемент из начала очереди.

    Integer pollLast();
    //Возвращает и удаляет элемент из хвоста очереди.

}
