/*
    Greetings! How are you doing?
    Good thank you!
    Oh, how interesting. Tell me more!
    Well, there's really nothing to tell.
    Thanks for sharing!
*/


import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        scanner.nextLine();
        
        System.out.println("Oh, how interesting. Tell me more!");
        scanner.nextLine();
        
        System.out.println("Thanks for sharing!");

    }
}
