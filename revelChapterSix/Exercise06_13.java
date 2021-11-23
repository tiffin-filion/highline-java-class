package revelChapterSix;

public class Exercise06_13 {

  public static void main(String[] args) {

    table();
    
  }
  
  public static void table() {
    // compute series: m(i) = 1/2 + 2/3 + ... + i/(i+1);
    
    System.out.println("i m(i)");
    
    int i = 0;
    double m = 0;
    for (i = 1; i <= 20; i++) {
      m += i / (i + 1.0);
      
      System.out.printf(i + " %.4f\n", m);
    }

  }

}
