
package library.database.base;
import java.util.ArrayList;
import library.records.base.IRecord;


public interface IBaseDatabase {
    void readFromFile();
    
    IRecord createRecordFrom(String line);
    
    boolean contains(String key);
    
    IRecord getRecord(String key);
    
    void deleteRecord(String key);
    
    void saveToFile();
    
    void insertRecord(IRecord record);
    
    ArrayList<IRecord> returnAllRecords();
    
}
