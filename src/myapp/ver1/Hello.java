package myapp.ver1;

import java.io.Console;

public class Hello {
    
    public static void main(String[] args) {

        // Get system console
        Console cons = System.console();

        // Read from the console, the result is assigned to a variable
        String name = "";
        while (name.trim().length() <= 0) {
            name = cons.readLine("What is your name?");
        }

        // use equals() for string comparison, == is for numbers
        if (name.equals("fred")) {
            System.out.println("Yabadabadoo");
        
        } else if (name.equals("barney")) {
            System.out.println("Hello barney");

            //trim length = 0
        } else if (name.trim().equals("")) {
            System.out.println("Please enter your name");

        } else {
            // Send a greeting to the name with a formatted string
            System.out.printf("Hello %s.\n\t Nice to make your acquantance\n"
                    , name.toUpperCase());
        }

    }
}