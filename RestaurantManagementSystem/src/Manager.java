import java.util.Date;
import java.util.List;

public class Manager extends Employee{

    public Manager(String name, String email, String phone) {
        super(name, email, phone);
    }

    public boolean addEmployee(List<Employee> employees, String name, String phone, String address, String type) {
        return true;
    }
}


