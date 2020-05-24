import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    
    public Grades() {
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double calculatePointAverage() {
        
        int total = 0;
        
        for(int i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
        }
        
        double average = total / this.grades.size();
        
        return average;
    }
    
    public double calculatePointAverageForPassingGrades() {
        int total = 0;
        int amountOfPassingGrades = 0;
        
        for(int i = 0; i < this.grades.size(); i++) {
            int grade = this.grades.get(i);
            
            if(grade >= 50) {
                total += grade;
                amountOfPassingGrades++;
            }
        }
        
        double average = total / amountOfPassingGrades;
        
        return average;
    }
    
    public double calculatePassPercentage() {
        int amountOfPassingGrades = 0;
        
        for(int i = 0; i < this.grades.size(); i++) {
            if(this.grades.get(i) >= 50) {
                amountOfPassingGrades++;
            }                       
        }
        
        double percentPassing = (double) 100 * amountOfPassingGrades / this.grades.size();
        
        return percentPassing;
    }
    
    public void calculateStringDistribution() {
        
        String[] grades = {"", "", "", "", "", ""};
        
        for(int i = 0; i < this.grades.size(); i++) {
            int grade = this.grades.get(i);
            
            if(grade < 50) {
                
                grades[0] += "*";
                
            } else if(grade >= 50 && grade < 60) {
                
                grades[1] += "*";
                
            } else if(grade >= 60 && grade < 70) {
                
                grades[2] += "*";
                
            } else if(grade >= 70 && grade < 80) {
                
                grades[3] += "*";
                
            } else if(grade >= 80 && grade < 90) {
                
                grades[4] += "*";
                
            } else if(grade >= 90) {
                
                grades[5] += "*";
            }
        }
        
        for(int i = grades.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + grades[i]);
        }
        
    }
}
