
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        Grades grades = new Grades();

        System.out.println("Enter point totals, -1 stops:");
        
        Boolean askUser = true;        
        while(askUser) {
            int grade = Integer.valueOf(scan.nextLine());
            
            if(grade == -1) {
                break;
            }
            
            if(grade >= 0 && grade <= 100) {
                grades.addGrade(grade);
            }
        }
        
        double totalGradePointAverage = grades.calculatePointAverage();
        double totalPassingAverage = grades.calculatePointAverageForPassingGrades();
        
        System.out.println("Point average (all): " + totalGradePointAverage);
        if(totalPassingAverage == 0) {
            System.out.println("Point average (passing): -");    
        } else {
            System.out.println("Point average (passing): " + totalPassingAverage);
        }
        
        System.out.println("Pass percentage: " + grades.calculatePassPercentage());
        System.out.println("Grade distribution:");
        grades.calculateStringDistribution();
    }
}
