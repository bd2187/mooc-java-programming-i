
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();
        
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if(identifier.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if(name.equals("")) {
                break;
            }
            
            Archive archivedItem = new Archive(identifier, name);
            if(!items.contains(archivedItem)) {
                items.add(archivedItem);    
            }
            
        }
        
        System.out.println("==Items==");
        
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
        
        

    }
}
