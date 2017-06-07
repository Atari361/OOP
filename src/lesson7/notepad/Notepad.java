package lesson7.notepad;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by dell on 6/6/2017.
 */
public class Notepad {

    private ArrayList<DateInNotepad> datesInNotepad = new ArrayList<>();

    public void addDateToNotepad(DateInNotepad date){
        datesInNotepad.add(date);
    }

    public void printNotepad(){

        for (DateInNotepad date : datesInNotepad){
            System.out.println("\nDATE: " + date.getCalendar().getTime());
            int i = 0;
            for (Message message : date.getMessages()){
                System.out.println("Message #" + i + ": " + message.getMessage());
                i++;
            }
        }
    }

    public ArrayList<DateInNotepad> getDatesInNotepad() {
        return datesInNotepad;
    }

    public class DateInNotepad{
        private GregorianCalendar calendar;
        private ArrayList<Message> messages = new ArrayList<>();

        public DateInNotepad(GregorianCalendar calendar) {
            this.calendar = calendar;
        }
        public void addMessage(Message message){
            messages.add(message);
        }

        public GregorianCalendar getCalendar() {
            return calendar;
        }

        public ArrayList<Message> getMessages() {
            return messages;
        }
    }

    public class Message{
        private String message;

        public Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
