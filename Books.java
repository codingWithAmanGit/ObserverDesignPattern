package Library;

import java.util.ArrayList;
import java.util.HashMap;


public class Books implements Library{
    
    private ArrayList<String>book = new ArrayList<>();
    String bookName;
    String person;
    HashMap<String, String> rented;
    HashMap<String, Integer> days;

    

    public Books(){
        rented = new HashMap<>();
        days = new HashMap<>();
    }

    public void add(){

        book.add("a");
        book.add("b");
        book.add("c");
        book.add("d");
    }

    public void update(String person, String bookName){


        if(book.contains(bookName)){
            book.remove(bookName);
            System.out.println(person + " has rented " + bookName + " for " + 7 + " days");
        }

        rented.put(bookName, person);

        days.put(bookName, 0);
    }

    public void remainder(){
        if(days.get(bookName) >=5 && days.get(bookName) <= 7){
            System.out.println("Few days are left to return the books.");
        }
    }

    public void printReport(){

        if(days.get(bookName) > 7){
            System.out.println(rented.get(bookName) + " has taken a lot of time to return. Kindy pay the overdue fees for the same.");
        }
    }


    public void search(String bookN){


        // for(int i = 0 ; i<book.size();i++){

        //     if(book.get(i) == bookN){
        //         System.out.println("The book is available in the library.");
        //     }

        // }

        if(book.contains(bookN)){
            System.out.println("The book is available in the library.");
        }else{
            System.out.println("Book is not available in the library.");
        }
        
    }

    

}
