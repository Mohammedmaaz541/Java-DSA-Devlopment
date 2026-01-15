package module_2_fundamentals.problems;

public class ReverseNumber {
    public static void main (String [] arg){
        int number=987654;
        int reverse=0;
        while (number>0){

            int LastDigit=number%10;

            reverse=reverse*10+LastDigit;

            number=number/10;

        }
        System.out.println(reverse);
    }
}
