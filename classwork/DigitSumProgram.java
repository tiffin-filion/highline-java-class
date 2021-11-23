package classwork;
/*Write a method digitSum that accepts an integer parameter and returns the sum of its digits.

Assume that the number is non-negative.

Example: digitSum(29107) returns 2+9+1+0+7 or 19


Hint: Use the % operator to extract a digit from a number.*/
public class DigitSumProgram{

public static void main (String[] args){

int result=digitSum(1129);
System.out.println("Answer is"+result);


}
public static int digitSum(int n) {
    n = Math.abs(n);           // handle negatives
    
    int sum = 0;
    while (n > 0) {
        sum = sum + (n % 10);  // add last digit
        n = n / 10;            // remove last digit
    }
    
    return sum;
}

}