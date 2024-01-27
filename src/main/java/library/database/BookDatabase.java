package library.database;

import library.database.base.BaseDatabase;
import java.util.ArrayList;
import library.records.base.IRecord;
import library.records.Book;

public class BookDatabase extends BaseDatabase{

    public BookDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
        this.readFromFile();
    }

    @Override
    public IRecord createRecordFrom(String line) {
        String parts[] = line.split(",", 5);
        
        return new Book(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]));
    }
}
