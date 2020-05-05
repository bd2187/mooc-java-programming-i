import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> myBooks = new ArrayList<> ();
        
        Boolean askUser = true;
        
        while(askUser) {
            
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication Year:");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            myBooks.add(new Book(title, pages, pubYear));            
        }
        
        System.out.println("What information will be printed?");
        String userRes = scanner.nextLine();
        
        for(int i = 0; i < myBooks.size(); i++) {
            Book currentBook = myBooks.get(i);
            if(userRes.equals("everything")) {
                System.out.println(currentBook.toString());
            } else if(userRes.equals("name")) {
                System.out.println(currentBook.getName());
            }
        }


    }
}
