package module_2_fundamentals.assignment;

import java.util.Scanner;
public class SimpleStudentApp {
    public static void main(String [] arg){
        Scanner student=new Scanner(System.in);

        System.out.println("Enter your name :");
        String name=student.nextLine();

        System.out.println("Enter your age :");
        int age=student.nextInt();

        System.out.println("Enter your GPA");
        float gpa=student.nextFloat();

        System.out.println("Enter your height");
        float height=student.nextFloat();

        System.out.println("Enter your Weight");
        float weight= student.nextFloat();

        float bmi=weight/(height*height);
        System.out.println("your BMI is" + bmi);

        if (age<18){
            System.out.println("You are Minor");
        }else {
            System.out.println("You are Adult");
        }

        String result= gpa>=2.5 ? "Pass" :"Fail";
        System.out.println("Result"+ result);



    }
}
