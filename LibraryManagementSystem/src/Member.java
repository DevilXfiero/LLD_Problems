import java.util.Date;

public class Member extends Account {
    private Date dateOfMembership;

    private int totalBooksCheckedout;

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getTotalBooksCheckedout() {
        return totalBooksCheckedout;
    }

    public void setTotalBooksCheckedout(int totalBooksCheckedout) {
        this.totalBooksCheckedout = totalBooksCheckedout;
    }

    private void incrementTotalBooksCheckedout() {
        this.totalBooksCheckedout++;
    }

    public boolean checkoutBookItem(BookItem bookItem) {
        if(this.totalBooksCheckedout >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
            System.out.println("The user already checked-out maximum number of books");
            return false;
        }

        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode);

        if(bookReservation != null && bookReservation.getMemberId() != this.getId()) {
            System.out.println("This book is reserved by another member");
            return false;
        } else if(bookReservation != null) {
            bookReservation.updateStatus(ReservationStatus.COMPLETED);
        }

        if(!bookItem.checkout(this.getId())) {
            return  false;
        }

        this.incrementTotalBooksCheckedout();
        return true;
    }
}
