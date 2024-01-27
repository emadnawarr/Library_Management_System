package library.database.base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import library.records.base.IRecord;

public abstract class BaseDatabase {

    protected ArrayList<IRecord> records;
    protected String filename;

    public void readFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.filename));
            String line;
            while ((line = reader.readLine()) != null) {
                this.records.add((createRecordFrom(line)));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("No " + this.filename + " file available!");
        }
    }

    public abstract IRecord createRecordFrom(String line);

    public boolean contains(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (key.equals(this.records.get(i).getSearchKey())) {
                return true;
            }
        }
//        System.out.println("IRecord not found!");
        
        return false;
    }

    public IRecord getRecord(String key) {
        if (contains(key)) {
            for (int i = 0; i < this.records.size(); i++) {
                if (key.equals(this.records.get(i).getSearchKey())) {
                    return this.records.get(i);
                }
            }
        }
        return null;
    }

    public void deleteRecord(String key) {
        this.records.remove(getRecord(key));
    }

    public void saveToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename, false));
            for (int i = 0; i < this.records.size(); i++) {
                writer.write(this.records.get(i).lineRepresentation() + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("No file available");
        }
    }

    public void insertRecord(IRecord record) {
        this.records.add(record);
        //System.out.println("IRecord added successfully!");
    }

    public ArrayList<IRecord> returnAllRecords() {
        return records;
    }

//    public boolean isIdAvailable(String key) {
//        for (IRecord x : this.records) {
//            if (key.equals(x.getSearchKey())) {
//                return false;
//            }
//        }
//        return true;
//    }
}
