
package library.records.base;

public abstract class Record implements IRecord{
    protected String Id;
    
    @Override
    public String lineRepresentation(){
        return this.Id + ",";
    }
    
    @Override
    public String getSearchKey(){
        return this.Id;
    }
}
