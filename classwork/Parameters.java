package classwork;

public class Parameters {
public static void main(String[] args){
	line(3,3.3);
	line(7,2.2);
	line(15,6.4);
}


public static void line(int times,double number){
	for(int i=1;i<=times;i++){
		System.out.print(number+" ");
	}
	System.out.println();
}
}
