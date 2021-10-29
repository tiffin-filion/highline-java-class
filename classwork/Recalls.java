package classwork;

import java.util.Scanner;

public class Recalls {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter model name: ");
    String modelName = input.nextLine();
    
    System.out.print("Enter model year: ");
    int modelYear =  input.nextInt();
    

      if ((modelName == "Extravagant" || modelName == "Guzzler") && (modelYear == 1999)) {
        System.out.println(false);
      }
      else {
        System.out.println(true);
      }
    }
}
