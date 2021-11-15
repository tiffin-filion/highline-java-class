package file_processing;

import java.util.*;
import java.io.*;

public class printToFile {

  public static void main(String[] args) {

    PrintStream out = new PrintStream(new File("message.txt"));
    out.println("Testing,");
    out.println("1, 2, 3.");
    out.println();
    out.println("This is my output file.");

  }

}
