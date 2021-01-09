public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
                book.status = Status.AVAILABLE;
                break;
            case ARCHIVED:
                book.status = Status.ARCHIVED;
                break;
            case OVERDUED:
                book.status = Status.OVERDUED;
                break;
        }
    }
}