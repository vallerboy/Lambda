package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 23.08.2017.
 */
public class Company {
    private String name;
    private String city;

    public Company(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
