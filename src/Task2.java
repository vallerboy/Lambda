import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Lenovo on 22.08.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Function<Integer, Integer> move = (a) ->  (int) Math.sqrt(a + 5 * 10 / 20);

        List<Integer> changedList = map(Arrays.asList(5,8,12), move);
        for (Integer a : changedList) {
            System.out.println(a);
        }
    }

    public static List<Integer> map(List<Integer> a, Function<Integer, Integer> function){
        List<Integer> newIntegerList = new ArrayList<>();
        for(int i : a) {
            newIntegerList.add(function.apply(i));
        }
        return newIntegerList;
    }
}
