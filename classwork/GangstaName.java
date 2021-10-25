package classwork;
/* Write a program that outputs a person's "gangsta name."
first initial
Diddy
last name (all caps)
first name
-izzle

Example Output:
Type your name, playa: Marge Simpson
Your gangsta name is "M. Diddy SIMPSON Marge-izzle"
*/

// This program prints your "gangsta" name.

import java.util.*;

public class GangstaName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name, playa: ");
        String name = console.nextLine();

        // split name into first/last name and initials
        String first = name.substring(0, name.indexOf(" "));
        String last = name.substring(name.indexOf(" ") + 1);
        last = last.toUpperCase();
        String fInitial = first.substring(0, 1);
        
        System.out.println("Your gangsta name is \"" + fInitial +
                ". Diddy " + last + " " + first + "-izzle\"");
    }
}
