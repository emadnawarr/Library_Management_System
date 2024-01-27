
package library.main;

import library.records.base.IRecord;
import library.roles.AdminRole;

public class TestAdmin {

    public static void test1() {
        AdminRole admin = new AdminRole();
        IRecord[] arrayOfLibrarianUsers = admin.getList();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        admin.addLibrarian("L1100", "Mariam", "mariam@gmail.com", "Alexandria", "01011845684");
        arrayOfLibrarianUsers = admin.getList();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        System.out.println(arrayOfLibrarianUsers[2].lineRepresentation());
        admin.remove("L1400");
        arrayOfLibrarianUsers = admin.getList();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        System.out.println(arrayOfLibrarianUsers[2].lineRepresentation());
        admin.remove("L1600");
        arrayOfLibrarianUsers = admin.getList();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        System.out.println(arrayOfLibrarianUsers[3].lineRepresentation());
        admin.logout();
    }

    public static void main(String[] args) {
        test1();
    }
}
