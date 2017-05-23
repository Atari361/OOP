package lesson4.Telephone;

/**
 * Created by dell on 5/23/2017.
 */
public class Contact {
    String FIO;
    int telephone;

    public Contact(String name, int telephone){
        this.FIO = name;
        this.telephone = telephone;
    }

    public String getFIO() {
        return FIO;
    }

    public int getTelephone() {
        return telephone;
    }

}
