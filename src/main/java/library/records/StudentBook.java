package library.records;

import library.records.base.Record;
import java.time.LocalDate;

public class StudentBook extends Record {

    private final String bookId;
    private final LocalDate borrowDate;

    public StudentBook(String studentId, String bookId, LocalDate borrowDate) {
        this.Id = studentId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }

    public String getStudentId() {
        return this.Id;
    }

    public String getBookId() {
        return bookId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String getSearchKey() {
        return super.getSearchKey() + "," + this.bookId;
    }

    @Override
    public String lineRepresentation() {
        return super.lineRepresentation() + this.bookId + "," + this.borrowDate;
    }
}
