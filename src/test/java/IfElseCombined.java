import java.util.Scanner;

public class IfElseCombined {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the x :");
        int x = input.nextInt();
        System.out.println("Please enter the y :");
        int y = input.nextInt();
        if (x == 5 && y == 6)
            System.out.println("Both values are correct");

        else {
            System.out.println("The condition is not satisfied");
        }
    }
}
