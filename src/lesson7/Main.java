package lesson7;

/**
 * Created by dell on 6/6/2017.
 */
public class Main {

    public static void main(String[] args) {
        NestedInner parent = new NestedInner();
        NestedInner.Inner inner = parent.new Inner();

        NestedInner.Inner innerChild = new NestedInner().new Inner();


    }
}
