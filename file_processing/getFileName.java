package file_processing;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class getFileName {

  public static void main(String[] args) {
    
  }
  
  public static String getFileName() {
    Scanner console = new Scanner(System.in);
    String filename = "";
    do {
        System.out.print("Type a file name: ");
        filename = console.nextLine();
    } while (!(new File(filename).exists()));
    return filename;
}

}
