
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Boolean askUser = true;        
        ArrayList<String> namesList = new ArrayList<> ();
        while(askUser) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                askUser = false;
            } else {
                namesList.add(input);
            }
        }
        
        int ageOfOldest = 0;
        String nameOfTheOldest = "";
        for(int i = 0; i < namesList.size(); i++) {
            String person = namesList.get(i);
            String[] personArr = person.split(",");
            int age = Integer.valueOf(personArr[1]);
            String name = personArr[0];
            
            if(age > ageOfOldest) {
                ageOfOldest = age;
                nameOfTheOldest = name;
            }                        
        }
        
        System.out.println("Name of the oldest: " + nameOfTheOldest);
 


    }
}
