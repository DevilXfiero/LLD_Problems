import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    List<Reservation> reservations;


    public Customer(String name, String email, String phone) {
        super(name, email, phone);
        this.reservations = new ArrayList<>();
    }


}
