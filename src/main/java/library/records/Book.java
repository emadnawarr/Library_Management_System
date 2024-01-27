package library.records;

import library.records.base.Record;

public class Book extends Record{

    private final String title;
    private final String author;
    private final String publisher;
    private int quantity;

    public Book(String bookId, String title, String author, String publisher, int quantity) {
        this.Id = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    @Override
    public String lineRepresentation(){
        return super.lineRepresentation() + this.title + "," + this.author + "," + this.publisher + "," + this.quantity;
    }
    
}
