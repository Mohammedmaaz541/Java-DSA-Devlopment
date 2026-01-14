package module_2_fundamentals.assignment;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("************Choose Menu**************");
        System.out.println("************Choose your operation :+, -, *, / ********");
        String userChoice=sc.next();

        if (
                !userChoice.equals("+") &&
                        !userChoice.equals("-") &&
                        !userChoice.equals("*") &&
                        !userChoice.equals("/")
        ) {
            System.out.println("invalid");
            return;
        }



        System.out.println("Enter the first number");
        int firstNumber=sc.nextInt();



        System.out.println("Enter the Secound number");
        int secoundNumber=sc.nextInt();

        switch (userChoice){

            case "+":
                System.out.println(firstNumber+secoundNumber);
                break;

            case "-":
                System.out.println(firstNumber-secoundNumber);
                break;

            case "*":
                System.out.println(firstNumber*secoundNumber);
                break;

            case "/":
                System.out.println(firstNumber/secoundNumber);
                break;

            default:
                System.out.println("invalid input");
                break;
        }





    }
}
