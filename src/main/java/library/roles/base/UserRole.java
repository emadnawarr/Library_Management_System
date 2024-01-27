
package library.roles.base;

import java.util.ArrayList;
import library.database.base.BaseDatabase;
import library.records.base.IRecord;

public abstract class UserRole { //it is the parent of admin and librarian..its database is of books in the librarian.
    protected BaseDatabase db;
    
    public IRecord[] getList() {

        ArrayList<IRecord> recordsList = this.db.returnAllRecords();
        IRecord[] recordArr = new IRecord[recordsList.size()];
        int k = 0;
        for (IRecord x : recordsList) {
            recordArr[k++] = x;
        }
        return recordArr;
    }

    public void remove(String key) {
        this.db.deleteRecord(key);
    }
    
    public void logout() {
        this.db.saveToFile();
    }
    
    public boolean isIdAvailable(String key) {
        for (IRecord x : this.db.returnAllRecords()) {
            if (key.equals(x.getSearchKey())) {
                return false;
            }
        }
        return true;
    }
}
