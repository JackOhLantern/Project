import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Declare Scanner
        Scanner Input = new Scanner(System.in);
        //Declare Variables
        double Input1 = 0.0;
        double Input2 = 0.0;
        int CalcSelection = 0;
        double Output =0.0;

        //Process

        System.out.print("Enter first operand: ");
        Input1 = Input.nextDouble();
        System.out.print("Enter second operand: ");
        Input2 = Input.nextDouble();

        System.out.println("This is a test for github");

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Which operation do you want to perform? ");
        CalcSelection = Input.nextInt();

        switch(CalcSelection)
        {
            case 1:
                Output = Input1 + Input2;
                System.out.println("The result of the operation is " + Output + ". Goodbye!");
                break;
            case 2:
                Output = Input1 - Input2;
                System.out.println("The result of the operation is " + Output + ". Goodbye!");
                break;
            case 3:
                Output = Input1 * Input2;
                System.out.println("The result of the operation is " + Output + ". Goodbye!");
                break;
            case 4:
                Output = Input1 / Input2;
                System.out.println("The result of the operation is " + Output + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection! Terminating program.");

        }





    }
}
