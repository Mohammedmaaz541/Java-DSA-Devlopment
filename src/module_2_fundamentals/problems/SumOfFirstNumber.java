package module_2_fundamentals.problems;

import java.util.Scanner;
public class SumOfFirstNumber {
    public static void main(String [] arg){
        Scanner num=new Scanner(System.in);
        int number=num.nextInt();
        int i=0;
        int sum=0;
        while (i<=number){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
