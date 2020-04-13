import java.util.*;

public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you want for your retirement? ");
        double goal = in.nextDouble();

        System.out.print("How much money do you want to pay for your retirement every year? ");
        double payment = in.nextDouble();

        System.out.print("What is the interest rate? ");
        double rate = in.nextDouble();

        int year = 0;
        double total = 0.0;

        while(total < goal) {
            total += payment;
            double interest = total * rate;
            total += interest;
            year += 1;
        }
        System.out.println("You will retire in " + year + " years.");
    }
}