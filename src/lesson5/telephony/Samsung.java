package lesson5.telephony;

import lesson4.Telephone.Phone;
import lesson4.Telephone.SimCard;

/**
 * Created by dell on 5/29/2017.
 */
public class Samsung extends Phone{


    String typeOfInput;

    public Samsung(String model, SimCard simCard, String typeOfInput) {
        super(model, simCard);
        this.typeOfInput = typeOfInput;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getModel() + "\n");
        sb.append(typeOfInput + "\n");
        sb.append(super.getSimcardInfo() + "\n");
        return sb.toString();
    }
}
