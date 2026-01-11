import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter weight: ");
        int weight = sc.nextInt();
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
         
        if (age>=18){
            System.out.println("you are an adult");
        } else {
            System.out.println("you are a minor");
        }
        if (age>=18){
        if (weight>=50) {
            System.out.println("elgible for vote and health program");}
             else { System.out.println("elgible for vote but not for health program"); }
        } else  { System.out.println("not elgible for vote and health program");}

        
        if (marks>=90){
            System.out.println("Grade A");
        } else if (marks>=80) {
            System.out.println("Grade B");
        } else if (marks>=70) {
            System.out.println("Grade C");
        } else if (marks>=60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}