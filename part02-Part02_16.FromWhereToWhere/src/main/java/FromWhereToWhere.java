
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int dest = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        
        if(dest > start) {
            for(int i = start; i <= dest; i++) {
                System.out.println(i);
            }            
        }
        

    }
}
