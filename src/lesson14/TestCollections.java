package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by dell on 7/4/2017.
 */
public class TestCollections {
    public static void main(String[] args) {
//        String[] arr = {"123", "321"};
//        Arrays.sort(arr);

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("Pavlo", 23));
        arrayList.add(new User("Mess", 29));
        arrayList.add(new User("Cook", 77));
//        Collections.sort(arrayList);
        Collections.sort(arrayList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return 0;
            }
        }
        //.thenComparing()
        );
        System.out.println(arrayList);
    }
}
