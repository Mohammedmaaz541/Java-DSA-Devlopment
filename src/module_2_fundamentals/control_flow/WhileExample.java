package module_2_fundamentals.control_flow;

public class WhileExample {
    public static void main(String [] arg){
        int count=0;
        while (count<10){
            System.out.println(count);
            count++;
        }
        System.out.println("Do while loop");
        int num=1;
        do{
            System.out.println(num);
            num++;
        }while (num<5);
    }
}
