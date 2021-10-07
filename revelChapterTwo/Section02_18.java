package revelChapterTwo;

public class Section02_18 {

	public static void main(String[] args) {
		/* Write a program that displays the following table.
		 * Cast floating-point numbers into integers
		 * a	b	pow(a,b)
		 * 1	2	1
		 * 2	3	8
		 * 3	4	81
		 * 4	5	1024
		 * 5	6	15625
		 */

		 // print table
		 System.out.println("a\t" + "b\t" + "pow(a, b)");
		 int a = 1;
		 int b = 2;
		 System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a,b));
		 ++a;
		 ++b;
		 System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a,b));
		 ++a;
		 ++b;
		 System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a,b));
		 ++a;
		 ++b;
		 System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a,b));
		 ++a;
		 ++b;
		 System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a,b));

	}

}
