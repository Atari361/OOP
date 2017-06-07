package lesson7;

/**
 * Created by dell on 6/6/2017.
 */
public class NestedInner {
    int a = 0;
    private static int b = 25;

    public static class Nested{
        public static void foo(){
            NestedInner.b = 50;
        }
    }

    public class Inner{
        public void foo(){
            NestedInner.b = 999;
            NestedInner.this.a = 888;
        }
    }
}
