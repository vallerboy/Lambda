package task2;

/**
 * Created by Lenovo on 23.08.2017.
 */
public class Worker {
    private String name;
    private String company;

    public Worker(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
