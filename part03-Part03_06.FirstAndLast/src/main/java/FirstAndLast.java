import java.util.Scanner;
import java.util.ArrayList;

public class FirstAndLast{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<> ();
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            } else {
                list.add(input);
            }
        }
        
        int listLength = list.size();
        
        System.out.println(list.get(0));
        System.out.println(list.get(listLength - 1));
    }

}







//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class FirstAndLast {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.equals("")) {
//                break;
//            }
//
//            list.add(input);
//        }
//
//    }
//}
