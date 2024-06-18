import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Please enter your salary :");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 0 & salary <= 4000)
            System.out.println("Yor salary will not have any reductions");
        else if (salary > 4000 & salary <= 6000) {
            System.out.println("You will get a tax of 10%");
        }
        else if (salary > 6000) {
            System.out.println("You will get a tax 20%");
        }
        else
            System.out.println("Please enter the real salary");
        input.close();
    }
}
