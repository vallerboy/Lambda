import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Lenovo on 23.08.2017.
 */
public class StreamsWork {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dziadek1", "Kuzyn2", "Mama3", "Babcia3", "Tata5");


        String oskar = "asd";
        Optional<String> optionalOskar = Optional.ofNullable(oskar);
        optionalOskar.ifPresent(s -> System.out.println(s));



        int optional =  names.stream()
                .filter(s -> s.contains("a"))
                .mapToInt(s -> Integer.parseInt(s.substring(s.length()-1, s.length())) + 1)
                .distinct()
                .sorted()
                .parallel()
                .reduce((s, s1) -> s > s1 ? s : s1)
                .getAsInt();

        // Tutaj tworzymy strumień bez uprzedniej oparcji na zbiorze danych
        // Generujemy przy nim 8 obiektów "Bufor"
        List<Bufor> list = IntStream.range(1, 10)
                .parallel()
                .mapToObj(s -> new Bufor("Buforek" + s))
                .collect(Collectors.toList());


        list.forEach(s -> System.out.println(s.getValue()));

        // Join na stringu

        String listInString = IntStream.range(1, 10)
                .parallel()
                .mapToObj(s -> new Bufor("Buforek" + s))
                .map(s -> s.getValue())
                .collect(Collectors.joining(" , ", "Oto nasze bufory: ", "."));
        System.out.println(listInString);

    }

    public static class Bufor {
        private String value;
        public Bufor(String s) {
            value = s;
        }

        public String getValue() {
            return value;
        }
    }
}
