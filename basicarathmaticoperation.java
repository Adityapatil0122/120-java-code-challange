
//take two numbers as input and perform basic arithmetic operations
import java.util.*;

public class basicarathmaticoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Substraction: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("division: " + ((double)a / b));

        sc.close();

        /*
         * int a= 5;
         * int b= 10;
         * syso("add:"+(a+b));
         * syso("sub:"+(a-b));
         * syso("mul:"+(a*b));
         * syso("div:"+(a/b));
         * 
         */
    }

}