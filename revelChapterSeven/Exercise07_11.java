package revelChapterSeven;

public class Exercise07_11 {

  public static void main(String[] args) {
    /* store individual numbers using an array, so they can be used after mean is obtained
     * have user enter 10 numbers and display mean and standard deviation
     */

    /* Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
     * The mean is 3.11
     * The standard deviation is 1.55738
     */

/********** MEAN **********/  
    public static double mean(double[] x) {
    // sum all the numbers in the array
    // sum = sum + input[i]
    double[] input={5,10,15,20,25};
    double n=5,sum=0,mean;
    for(int i=0;i<n;i++) 
    {
        sum=sum+input[i];
    }
    
    // find the mean sum / total number
    // mean = sum / n
    mean=sum/n;
    System.out.println("Mean :"+mean);
    }
/********** DEVIATION **********/    
    public static double deviation(double[] x) {
    // find variance of numbers - variance = sum of square of difference of mean with element / total number
    // sum += math.pow((input[i] - mean), 2);
    // mean = sum / (n - 1);
    sum=0;  
    for(int i=0;i<n;i++) 
    {
        sum+=Math.pow((input[i]-mean),2);
    
    }
    
    // deviation is square-root of variance
    // deviation = Math.sqrt(mean);
    mean=sum/(n-1);
    double deviation=Math.sqrt(mean);
    System.out.println("standard deviation :"+deviation);
    }
  }

}
