package classwork;
//When the method is called:
//The value is stored into the parameter variable.
//The method's code executes using that value.
public class parameter{
public static void main(String[] args) {
    chant(3);
    chant(7);
}

public static void chant(int times) {
    for (int i = 1; i <= times; i++) {
        System.out.println("Just a salad...");
    }
}
}