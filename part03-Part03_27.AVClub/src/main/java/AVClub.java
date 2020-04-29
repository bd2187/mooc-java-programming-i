import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Boolean askUserForInput = true;
        while(askUserForInput) {
            
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                askUserForInput = false;
            } else {
                
                String[] arr = input.split(" ");
                for(int i = 0 ; i < arr.length; i++) {
                    if(arr[i].contains("av")) {
                        System.out.println(arr[i]);
                    }
                }
            }
            
        }
    }
}