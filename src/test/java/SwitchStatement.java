import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value between 1 & 5");
        int grade = input.nextInt();

        switch (grade){
            case 1:
                System.out.println("The value is one");
                break;
            case 2:
                System.out.println("The value is two");
                break;
            case 3:
                System.out.println("The value is three");
                break;
            case 4:
                System.out.println("The value is four");
                break;
            case 5:
                System.out.println("The value is five");
                break;

        }
    }
}
