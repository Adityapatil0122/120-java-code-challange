
//WAP to accept marks of 5 subjects, calculate total, average. & display percentage.
import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        float avg = total / 5.f;
        float per = (total / 500.f) * 100;
        System.out.println("total marks = " + total);
        System.out.println("average marks = " + avg);
        System.out.println("percentage = " + per+"%");

    }
}
/*
 * int sub1 = 85;
 * int sub2 = 90;
 * int sub3 = 78;
 * int sub4 = 88;
 * int sub5 = 92;
 * int total = sub1 + sub2 + sub3 + sub4 + sub5;
 * float avg = total / 5.f;
 * float per = (total / 500.f) * 100;
 * System.out.println("total marks = " + total);
 * System.out.println("average marks = " + avg);
 * System.out.println("percentage = " + per);
 */