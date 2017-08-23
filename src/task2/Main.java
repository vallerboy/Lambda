package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 23.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Oskar", "AK"));
        workers.add(new Worker("Michal", "AK"));
        workers.add(new Worker("Marta", "Maspex"));

        Map<String, List<Worker>> stringListMap = workers.stream()
                .collect(Collectors.groupingBy(s -> s.getCompany()));

        stringListMap.values().forEach(s -> {
            System.out.println("Grupa: ");
            s.forEach(s1 -> System.out.println(s1.getName()));
        });
    }
}
