import java.util.Scanner;

public class ConditionalIfSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the x: ");
        int x = input.nextInt();
        System.out.println("Please enter the y: ");
        int y = input.nextInt();

        System.out.println("Please choose your operation\n" +
                "1 for addition\n" +
                "2 for subtraction\n" +
                "3 for multiplication\n" +
                "4 for divide");
        int choice = input.nextInt();
//        if (choice == 1)
//            System.out.println("x + y = " + (x + y));
//        else if (choice == 2)
//            System.out.println("x - y = " + (x - y));
//        else if (choice == 3)
//            System.out.println("x * y = " + (x * y));
//        else if (choice == 4)
//            System.out.println("x / y = " + (x / y));
//        else
//            System.out.println("True operation is not selected");
        switch (choice){
            case 1:
                System.out.println("x + y = " + (x + y));
                break;
            case 2:
                System.out.println("x - y = " + (x - y));
                break;
            case 3:
                System.out.println("x * y = " + (x * y));
                break;
            case 4:
                System.out.println("x / y = " + (x / y));
                break;
            default:
                System.out.println("True operation is not selected");
        }

    }

}


