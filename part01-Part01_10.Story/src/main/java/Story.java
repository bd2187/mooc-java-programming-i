/*
I will tell you a story, but I need some information first.
What is the main character called?
    Bob
What is their job?
    a builder
Here is the story:
Once upon a time there was Bob, who was a builder.
On the way to work, Bob reflected on life.
Perhaps Bob will not be a builder forever.
*/


import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        
        System.out.println("What is their job?");
        String occupation = scanner.nextLine();
        
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + occupation + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + occupation + " forever.");

    }
}
