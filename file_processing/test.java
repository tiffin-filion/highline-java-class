package file_processing;

import java.util.*;
import java.io.*;

public class test {

  public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("brownfox.txt"));
      while (input.hasNext()) {
        String token = input.next();
        System.out.println(token);
      }
}
}
