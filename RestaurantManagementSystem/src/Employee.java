import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public abstract class Employee extends Person{

    private String employeeID;
    private LocalDateTime dateJoined;

    public Employee(String name, String email, String phone, String employeeID, LocalDateTime dateJoined) {
        super(name, email, phone);
        this.employeeID = employeeID;
        this.dateJoined = dateJoined;
    }
    public Employee(String name, String email, String phone) {
        super(name, email, phone);
        this.employeeID = UUID.randomUUID().toString();
        this.dateJoined = LocalDateTime.now();
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDateTime getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDateTime dateJoined) {
        this.dateJoined = dateJoined;
    }
}
