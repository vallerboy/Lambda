package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 23.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Samsung", "Kraków"));
        companies.add(new Company("AkademiaKodu", "Wadowice"));
        companies.add(new Company("Ubisoft", "Warszawa"));

        companies.stream()
                .map(s -> s.getName())
                .forEach(s -> System.out.println(s));
    }
}
