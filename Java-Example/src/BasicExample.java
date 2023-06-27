// Import the Scanner class to read user input
import java.util.Scanner;

// Define a class named BasicExample
public class BasicExample {

    // Declare a class variable of type String
    static String classVariable = "Hello, this is a class variable!";

    // This is the main method which is the entry point of any Java program
    public static void main(String[] args) {

        // Print the class variable
        System.out.println(classVariable);

        // Declare a local variable
        int myNumber = 5;
        System.out.println("The value of myNumber is: " + myNumber);

        // Use a conditional
        if (myNumber < 10) {
            System.out.println("myNumber is less than 10");
        } else {
            System.out.println("myNumber is greater than or equal to 10");
        }

        // Use a loop
        for (int i = 0; i < 5; i++) {
            System.out.println("This is loop iteration number: " + i);
        }

        // Use a method
        String greeting = getGreeting("World");
        System.out.println(greeting);

        // Read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }

    // Method to return a greeting
    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
