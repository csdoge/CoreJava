import java.util.*;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you pay for your retirement every year? ");
        double balance = in.nextDouble();

        System.out.print("What is the interest rate? ");
        double rate = in.nextDouble();

        String input;
        int year = 1;
        double total = 0;

        do
        {   
            total += balance;
            double interest = total * rate;
            total += interest;
            System.out.println("You will get " + total + " in " + year + " year");
            year++;
            System.out.print("Do you retire?(Y/N) ");
            input = in.next();
        }
        while(input.equals("N"));
    }
}