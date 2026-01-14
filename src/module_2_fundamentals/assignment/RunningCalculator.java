package module_2_fundamentals.assignment;

import java.util.Scanner;
public class RunningCalculator {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        boolean continueCalculation = true;
        do {
            System.out.println("************Choose Menu**************");
            System.out.println("************Choose your operation :+, -, *, / ********");
            String userChoice = sc.next();

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
            int firstNumber = sc.nextInt();


            System.out.println("Enter the Secound number");
            int secoundNumber = sc.nextInt();

            switch (userChoice) {

                case "+":
                    System.out.println(firstNumber + secoundNumber);
                    break;

                case "-":
                    System.out.println(firstNumber - secoundNumber);
                    break;

                case "*":
                    System.out.println(firstNumber * secoundNumber);
                    break;

                case "/":
                    System.out.println(firstNumber / secoundNumber);
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }
            System.out.println("Do you want to perfrorm another calculation ? (yes/no)");
            String userResponse= sc.next();

            if(userResponse.equals("yes")){
                continueCalculation=true;
            }
            else {
                continueCalculation=false;
            }
        }while (continueCalculation==true);
    }
}
