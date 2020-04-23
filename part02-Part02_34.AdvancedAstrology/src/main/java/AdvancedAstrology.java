
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while(number > 0) {
            System.out.print("*");
            number--;
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while(number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        
        for(int i = 0; i < size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
        
    }

    public static void christmasTree(int height) {
        
        int starsCounter = 1;
        // part 3 of the exercise
        for(int i = 0; i < height; i++) {
            printSpaces(height - i);
            printStars(starsCounter);
            starsCounter += 2;
        }
        
        printSpaces(height -1);
        printStars(3);
        printSpaces(height -1);
        printStars(3);
        
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
