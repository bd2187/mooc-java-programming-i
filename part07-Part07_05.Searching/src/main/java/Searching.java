
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<> ();

        Book foo = new Book(507976, "507976");
        
        books.add(foo);
        
        binarySearch(books, 507976);

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {        
        int index = -1;
        for(int i = 0; i < books.size(); i++) {
            if(searchedId == books.get(i).getId()) {
                index = i;
            }
        }        
        return index;
    }

    
    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        
        int startIndex = 0;
        int sizeOfArr = books.size() - 1; 
        
        while(startIndex <= sizeOfArr) {
            
            int middleIndex = (sizeOfArr + startIndex) / 2; // 2
            int middleBookID = books.get(middleIndex).getId();
            
            System.out.println(middleBookID);
            if(middleBookID == searchedId) {
                return middleIndex;
            }
            
            if(searchedId > middleBookID) {
                startIndex = middleIndex + 1;                
            }
            
            if(searchedId < middleBookID) {
                sizeOfArr = sizeOfArr - 1;
            }
        }
        
        return -1;
        
    }
}

