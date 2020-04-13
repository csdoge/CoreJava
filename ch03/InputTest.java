import java.util.*;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();        // in.nextLine() rather than in.nextline()

        System.out.print("How old are you? ");
        int age = in.nextInt();     // in.nextInt() rather than in.nextLine()

        System.out.println("Hello, " + name + "!" + "You will be " + (age + 1) + " years old next year!");
    }
}