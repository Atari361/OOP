package lesson7.notepad;

import java.util.GregorianCalendar;

/**
 * Created by dell on 6/6/2017.
 */
public class MainNotepad {
    public static void main(String[] args) {

        Notepad notepad = new Notepad();



        notepad.addDateToNotepad(
                new Notepad().new DateInNotepad(
                        new GregorianCalendar(2017,6,6))
        );

        notepad.getDatesInNotepad().get(0).addMessage(
                new Notepad().new Message("Message1")
        );
        notepad.getDatesInNotepad().get(0).addMessage(
                new Notepad().new Message("SomeMessage2")
        );
        notepad.getDatesInNotepad().get(0).addMessage(
                new Notepad().new Message("OtherMessage3")
        );

        notepad.addDateToNotepad(
                new Notepad().new DateInNotepad(
                        new GregorianCalendar(2016,1,1))
        );

        notepad.getDatesInNotepad().get(1).addMessage(
                new Notepad().new Message("Message2")
        );
        notepad.getDatesInNotepad().get(1).addMessage(
                new Notepad().new Message("SomeMessage3")
        );
        notepad.getDatesInNotepad().get(1).addMessage(
                new Notepad().new Message("OtherMessage4")
        );

        notepad.printNotepad();
    }
}
