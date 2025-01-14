import java.util.List;

public class Receptionist extends Employee{

    public Receptionist(String name, String email, String phone) {
        super(name, email, phone);
    }

    public List<Customer> searchCustomers(String name);

    public boolean createReservation(List<Table> tables, Customer customer, int totalNumberOfPeoples) {
        List<Table> availableTables = List.of();
        int totalAvailableSeats = 0;
        for(int i=0; i<tables.size(); i++) {
            if(tables.get(i).isTableFree()) {
                totalAvailableSeats += tables.get(i).getMaxCapacity();
                availableTables.add(tables.get(i));
                if(totalAvailableSeats >= totalNumberOfPeoples) {
                    break;
                }
            }
        }

        if(availableTables.size() == 0)
            System.out.println("All the tables are currently booked, Please wait for sometime");



        Reservation reservation = new Reservation();
    }
}
