import java.util.Scanner;

public class ProfitorLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter cp: ");
        int cp = sc.nextInt();
        
        System.out.println("Enter sp: ");
        int sp = sc.nextInt();
        
        if (sp > cp) {
            int profit = sp - cp;
            System.out.println("Profit is " + profit);
        } else if (cp > sp) {
            int loss = cp - sp;
            System.out.println("Loss is " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}
