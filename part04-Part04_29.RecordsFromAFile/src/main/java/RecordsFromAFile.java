import java.util.Scanner;
import java.nio.file.Paths;

public class RecordsFromAFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        
        String fileName = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] lineArr = line.split(",");
                String name = lineArr[0];
                int age = Integer.valueOf(lineArr[1]);
                
                String years = "years";
                
                if(age == 1) {
                    years = "year";
                }
                
                
                System.out.println(name + ", age: " + age + " " + years);
            }
            
        } catch(Exception err) {
            
        }
    }
}