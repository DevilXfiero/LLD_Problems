import java.util.Date;

public class BookLending {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarcode;
    private String memberId;

    public static void lendBook(String barcode, String memberId);
    private static BookLending fetchLendingDetails(String barcode);

}
