package library.roles;

import static constants.FileNames.BOOKS_FILENAME;
import static constants.FileNames.STUDENTSBOOKS_FILENAME;
import library.roles.base.UserRole;
import java.time.LocalDate;
import library.records.Book;
import library.database.BookDatabase;
import library.records.StudentBook;
import library.database.StudentBookDatabase;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import library.records.base.IRecord;

public class LibrarianRole extends UserRole {

    private final StudentBookDatabase sBDatabase;

    public LibrarianRole() {
        this.db = new BookDatabase(BOOKS_FILENAME);
        this.sBDatabase = new StudentBookDatabase(STUDENTSBOOKS_FILENAME);
    }

    public void addBook(String id, String title, String author, String publisher, int quantity) {
        if (this.isIdAvailable(id)) {
            Book newBook = new Book(id, title, author, publisher, quantity);
            this.db.insertRecord(newBook);
        } else {
            System.out.println("Book Id already taken!");
        }
    }

    public int borrowBook(String studentId, String bookId, LocalDate borrowDate) {
        Book book = (Book) db.getRecord(bookId);
        if (!db.contains(bookId) || book.getQuantity() == 0) {
            System.out.println("The book you want to borrow is not in stock!");
            return 0;
        }
        String studentBookId = studentId + "," + bookId;
        if (sBDatabase.contains(studentBookId)) {
            System.out.println("Student already borrowed this book!");
            return 1;
        } else {
            book.setQuantity(book.getQuantity() - 1);
            sBDatabase.insertRecord(new StudentBook(studentId, bookId, borrowDate));
            System.out.println("Borrowing operation is successfully completed!");
            return 2;
        }
    }

    public double returnBook(String studentId, String bookId, LocalDate returnDate) {
        String studentBookId = studentId + "," + bookId;
        Book book = (Book) db.getRecord(bookId);
        if (book != null && sBDatabase.contains(studentBookId)) {
            book.setQuantity(book.getQuantity() + 1);
            StudentBook studentbook = (StudentBook) sBDatabase.getRecord(studentBookId);
            long daysBorrowed = DAYS.between(studentbook.getBorrowDate(), returnDate);
            this.sBDatabase.deleteRecord(studentBookId);
            System.out.println("Return operation is successfully completed!");
            if (daysBorrowed < 7) {
                return 0;
            } else {
                return (daysBorrowed - 7) * 0.5;
            }
        } else {
            System.out.println("The book you want to return is not in this library!");
            return 0;
        }
    }

    @Override
    public void logout() {
        super.logout();
        this.sBDatabase.saveToFile();
    }

    public IRecord[] getListOfBorrowingOperations() {
        ArrayList<IRecord> recordsList = this.sBDatabase.returnAllRecords();
        IRecord[] recordArr = new IRecord[recordsList.size()];
        int k = 0;
        for (IRecord x : recordsList) {
            recordArr[k++] = x;
        }
        return recordArr;
    }

    public boolean isStudentBookIdAvailable(String key) {
        for (IRecord x : this.sBDatabase.returnAllRecords()) {
            if (key.equals(x.getSearchKey())) {
                return false;
            }
        }
        return true;
    }

    public boolean isBookInStock(String bookId) {
        Book book = (Book) db.getRecord(bookId);
        if (!db.contains(bookId) || book.getQuantity() == 0) {
            System.out.println("The book you want to borrow is not in stock!");
            return false;
        }
        return true;
    }
}
