
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        Boolean askForInput = true;
        
        while(askForInput) {
            System.out.println("Name:");

            String input = scanner.nextLine();
            
            if(input.isEmpty()) {
                break;
            } else {
                items.add(new Item(input));
            }
        }
        
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
        }

    }
}
