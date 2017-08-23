import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Lenovo on 22.08.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("DOrotka", "Kacper", "Tomek", "Alfred");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        //==
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Comparator myCompar =  new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };


        names.forEach(s -> System.out.println(s));
    }
}
