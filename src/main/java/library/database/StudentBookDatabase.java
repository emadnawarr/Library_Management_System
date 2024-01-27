package library.database;

import library.database.base.BaseDatabase;
import java.util.ArrayList;
import java.time.LocalDate;
import library.records.StudentBook;
import library.records.base.IRecord;

public class StudentBookDatabase extends BaseDatabase {
    
    public StudentBookDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
        this.readFromFile();
    }

    @Override
    public IRecord createRecordFrom(String line) {
        String parts[] = line.split(",", 3);
        return new StudentBook(parts[0], parts[1], LocalDate.parse(parts[2]));
    }
    
}
