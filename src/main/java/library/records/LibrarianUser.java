package library.records;

import library.records.base.Record;

public class LibrarianUser extends Record{

    private final String name;
    private final String email;
    private final String address;
    private final String phone;

    public LibrarianUser(String librarianId, String name, String email, String address, String phone) {
        this.Id = librarianId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String lineRepresentation() {
        
        return super.lineRepresentation() + this.name + "," + this.email + "," + this.address + "," + this.phone;
    }

}
