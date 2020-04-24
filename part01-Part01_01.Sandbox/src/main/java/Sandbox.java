import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> myList = new ArrayList<>();
        
        myList.add("first");
        myList.add("second");
        
        System.out.println(myList.get(0));
    }
}