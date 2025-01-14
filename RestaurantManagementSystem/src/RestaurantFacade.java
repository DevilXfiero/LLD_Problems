import java.util.List;

public class RestaurantFacade {

    Restaurant restaurant;
    List<Table> tables;
    List<Employee> employees;
    Receptionist receptionist;


    public void createTable() {
        Table table = new Table();

    }

    public void reserveTable(Customer customer, int numberOfPeoples) {
        receptionist.createReservation(tables, customer, numberOfPeoples);
    }

    public void createOrder() {

    }

    public void prepareOrder() {

    }

    public void getBill() {

    }


}
