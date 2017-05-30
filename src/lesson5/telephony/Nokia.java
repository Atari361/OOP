package lesson5.telephony;

import lesson4.Telephone.Phone;

/**
 * Created by dell on 5/29/2017.
 */
public class Nokia extends Phone{

    String typeOfInput;

    public Nokia(String model, String typeOfInput) {
        super(model);
        this.typeOfInput = typeOfInput;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getModel());
        sb.append(typeOfInput);
        sb.append(super.getSimcardInfo());
        return sb.toString();
    }
}
