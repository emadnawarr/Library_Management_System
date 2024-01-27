package library.database;

import library.database.base.BaseDatabase;
import java.util.ArrayList;
import library.records.LibrarianUser;
import library.records.base.IRecord;

public class LibrarianUserDatabase extends BaseDatabase {

    public LibrarianUserDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
        this.readFromFile();
    }

    @Override
    public IRecord createRecordFrom(String line) {
        String parts[] = line.split(",", 5);

        return new LibrarianUser(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }
}
