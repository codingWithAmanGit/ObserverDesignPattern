package Library;


public class Main {
    
    public static void main(String[]  args){


        Observer search = new searchBooks();
        search.add();
        search.update("b");

        rentBooks rent = new rentBooks("a", "aman");
        rent.update("a");
        // rent.display();
        // rent.printOverdues();


    }
}
