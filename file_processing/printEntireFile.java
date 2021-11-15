package file_processing;

import java.util.*;
import java.io.*;

public class printEntireFile {

  public static void main(String[] args) {
    
  }
  
  public static void printEntireFile() throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.print("Type a file name: ");
    String filename = console.nextLine();
    Scanner input = new Scanner(new File(filename));
    while (input.hasNextLine()) {
        System.out.println(input.nextLine());
    }
}
}

