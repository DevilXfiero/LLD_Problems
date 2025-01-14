import enums.TableStatus;

import java.util.List;

public class Table {
    private int tableID;
    private TableStatus status;
    private int maxCapacity;

    public Table(int tableID, TableStatus status, int maxCapacity, List<TableSeat> seats) {
        this.tableID = tableID;
        this.status = status;
        this.maxCapacity = maxCapacity;
        this.seats = seats;
    }

    List<TableSeat> seats;

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<TableSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<TableSeat> seats) {
        this.seats = seats;
    }

    public boolean isTableFree() {
        if(this.status == TableStatus.FREE) {
            return true;
        }
        return false;
    };

    public boolean addReservation() {

    };
}
