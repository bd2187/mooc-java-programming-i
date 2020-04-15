import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        int lowerValue = 0;
        int taxAtLowerLimit = 0;
        double taxRate = 0.0;
        
        boolean noTax = false;
        
        if(value < 5000) {
            
            noTax = true;
            
        } else if(value >= 5000 && value < 25000) {
            
            lowerValue = 5000;
            taxAtLowerLimit = 100;
            taxRate = 0.08;
            
        } else if(value >= 25000 && value < 55000) {
            
            lowerValue = 25000;
            taxAtLowerLimit = 1700;
            taxRate = 0.10;
            
        } else if(value >= 55000 && value < 200000) {
            
            lowerValue = 55000;
            taxAtLowerLimit = 4700;
            taxRate = 0.12;
            
        } else if(value >= 200000 && value < 1000000) {
            
            lowerValue = 200000;
            taxAtLowerLimit = 22100;
            taxRate = 0.15;            
            
        } else if(value >= 1000000) {
            
            lowerValue = 1000000;
            taxAtLowerLimit = 142100;
            taxRate = 0.17;       
            
        }
        
        if(noTax) {
            
            System.out.println("No tax!");
            
        } else {
            
            double giftTax = (taxAtLowerLimit + (value - lowerValue) * taxRate);
            
            System.out.println("Tax: " + giftTax);
            
        }
        
        
        
        
        

    }
}
