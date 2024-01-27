package library.roles;

import static constants.FileNames.LIBRARIANS_FILENAME;
import library.roles.base.UserRole;
import library.records.LibrarianUser;
import library.database.LibrarianUserDatabase;

public class AdminRole extends UserRole {

    public AdminRole() {
        this.db = new LibrarianUserDatabase(LIBRARIANS_FILENAME);
    }

    public void addLibrarian(String librarianId, String name, String email, String address, String phone) {
        if (this.isIdAvailable(librarianId)) {
            LibrarianUser newLibrarian = new LibrarianUser(librarianId, name, email, address, phone);
            this.db.insertRecord(newLibrarian);
        } else {
            System.out.println("Librarian Id already taken!");
        }
    }
}
