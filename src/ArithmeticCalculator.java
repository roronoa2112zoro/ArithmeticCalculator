import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args)
    {
        float num1, num2, result;
        char operation;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome to your Arithmetic Calculator\n");
            System.out.println("1. Addition\n");
            System.out.println("2. Subtraction\n");
            System.out.println("3. Multiplication\n");
            System.out.println("4. Division\n");
            System.out.println("5. Exit\n\n");
            System.out.println("Enter your operation : ");
            operation = sc.next().charAt(0);
            switch(operation)
            {
                case '1' : System.out.println("Enter Two Number : ");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    result = num1 + num2;
                    System.out.println("\nAddition of numbers is " + result);
                    break;
                case '2' : System.out.println("Enter Two Number : ");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    result = num1 - num2;
                    System.out.println("\nSubtraction of numbers is " + result);
                    break;
                case '3' : System.out.println("Enter Two Number : ");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    result = num1 * num2;
                    System.out.println("\nMultiplication of numbers is " + result);
                    break;
                case '4' : System.out.println("Enter Two Number : ");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    result = num1 / num2;
                    System.out.println("\nDivision of numbers is " + result);
                    break;
                case '5' : System.exit(0);
                    break;
                default : System.out.println("\nWrong operation!!!");
                    break;
                }
                System.out.println("\n--------------------------------------------------------------\n");
            }while(operation != 5);
        }
    }


