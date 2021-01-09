public class Launch {
    public static void main(String[] args) {
        Book book = new Book("War and Peace");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        fromBorrowedStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus());
        fromArchivedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        fromArchivedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus());
    }
}