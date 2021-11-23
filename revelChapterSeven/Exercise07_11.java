package revelChapterSeven;

import java.util.*;

public class Exercise07_11 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ten numbers: ");
    double[] numbers = new double[10];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }
    
    double mean = mean(numbers);
    double deviation = deviation(numbers, mean);
    
    System.out.println("The mean is " + mean);
    System.out.println("The standard deviation is " + deviation);
  }
   

/********** MEAN **********/  
  public static double mean(double[] x) {
    // sum all the numbers in the array
    double sum = 0;
    double mean = 0;
    
    for (int i = 0; i < x.length; i++) {
        sum = sum + x[i];
    }
    
    // find the mean sum / total number
    mean = sum / x.length;
    return mean;
  }
    
    
/********** DEVIATION **********/    
  public static double deviation(double[] x, double mean) {
  // find variance of numbers - 
  double sum = 0;  
  double numbers = x.length - 1;
  
  for (int i = 0; i < x.length; i++) {
      sum += Math.pow((x[i] - mean), 2);
  }
  
  double dev = sum / numbers;
  
  double deviation = Math.sqrt(dev);
  return deviation;
  }
 }

