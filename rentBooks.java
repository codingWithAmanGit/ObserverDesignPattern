package Library;

import java.util.HashMap;

public class rentBooks implements Observer{

    Library books;
    String bookName;
    String person;
    HashMap<String, String> rented;
    HashMap<String, Integer> days;

    public rentBooks(String bookName, String person){
        this.bookName = bookName;
        this.person = person;
        rented = new HashMap<>();
        books = new Books();
    }
    
    public void update(String bookName){
        books.update(person , bookName);
    }

    public void display(){
        books.remainder();
    }

    public void printOverdues(){
        books.printReport();
    }

    public void add(){

    }



}
