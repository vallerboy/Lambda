import java.util.Collection;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Lenovo on 22.08.2017.
 */
public class Main {
    public static void main(String[] args) {



        System.out.println(operateBinary(5, 5, (a, b) ->  a - b));
    }

    public static double operateBinary(double a, double b,  BiFunction<Double, Double, Double>  math){
        return math.apply(a, b);
    }


    ///////////////////////

}
