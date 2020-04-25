import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<> ();
        
        while(true) {
            String name = scanner.nextLine();
            
            if(name.equals("")) {
                break;
            } else {
                names.add(name);
            }
        }
        
        System.out.println("Search for?");
        String query = scanner.nextLine();
        
        if(names.contains(query)) {
            System.out.println(query + " was found!");
        } else {
            System.out.println(query + " was not found!");
        }
        
    }
}