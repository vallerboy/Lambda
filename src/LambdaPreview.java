import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Lenovo on 22.08.2017.
 */
public class LambdaPreview {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ALek", "Dorota", "Kocur", "Pies", "Oskar");


        names.forEach(s -> System.out.println(s));
    }
}
