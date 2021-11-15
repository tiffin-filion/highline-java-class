package file_processing;

public class printEntireFile2 {

  public static void main(String[] args) {
 // reprompts until file name is valid
    
  }
  
  public static void printEntireFile2() throws FileNotFoundException {
    String filename = getFileName();
    Scanner input = new Scanner(new File(filename));
    while (input.hasNextLine()) {
        System.out.println(input.nextLine());
    }
}
}
