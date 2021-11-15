package file_processing;

import java.util.*;
import java.io.*;

public class PrintMyself {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(new File("file_processing/PrintMyself.java"));
    while (input.hasNextLine()) {
        System.out.println(input.nextLine());
    }
}
  }

