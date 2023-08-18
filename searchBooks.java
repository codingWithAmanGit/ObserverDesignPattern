package Library;

public class searchBooks implements Observer {


    Library books;

    public searchBooks(){
        books = new Books();
    }

    public void add(){
        books.add();
    }
    
    public void update(String bookName){
        books.search(bookName);
    }
}
