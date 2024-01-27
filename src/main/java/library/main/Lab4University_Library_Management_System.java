package library.main;

import library.roles.AdminRole;
import library.roles.LibrarianRole;
import java.time.LocalDate;

public class Lab4University_Library_Management_System {

    public static void main(String[] args) {
        testLibrary();

    }

    public static void testLibrary() {
        AdminRole admin = new AdminRole();
        LibrarianRole librarian = new LibrarianRole();
        admin.addLibrarian("librarianId", "name", "email", "address", "phone");
        admin.remove("librarianId2");
        librarian.addBook("bookid", "title", "author", "publisher", 5);
        librarian.addBook("bookid2", "title2", "author2", "publisher2", 10);
        librarian.addBook("bookid3", "title3", "author3", "publisher3", 15);
        librarian.borrowBook("studentid1", "bookid", LocalDate.of(2022, 10, 8));
        librarian.borrowBook("studentid2", "bookid2", LocalDate.of(2022, 10, 16));
        librarian.returnBook("studentid1", "bookid", LocalDate.of(2022, 10, 20));
        librarian.returnBook("studentid", "bookid2", LocalDate.of(2022, 10, 21));
        admin.logout();
        librarian.logout();
    }
}
