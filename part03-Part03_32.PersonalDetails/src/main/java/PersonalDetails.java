
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Boolean askUser = true;
        ArrayList<String> people = new ArrayList<> (); 
        
        while(askUser) {
            
            String input = scanner.nextLine();
            
            
            if(input.equals("")) {
                break;
            } else {
                people.add(input);
            }
       }
            
        
        String longestName = "";
        int sumOfBirthYears = 0;
        for(int i = 0; i < people.size(); i++) {
            
            String[] personArr = people.get(i).split(",");
            String name = personArr[0];
            int age = Integer.valueOf(personArr[1]);
            
            if(name.length() > longestName.length()) {
                longestName = name;
            }
            
            sumOfBirthYears += age;                        
        }
        
        double avgBirthYears = (double) sumOfBirthYears / people.size();
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avgBirthYears);
                

    }
}
