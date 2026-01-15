package module_2_fundamentals.control_flow;

public class ForExample {
    public static void main(String [] arg){

        for(int i=0;i<=5;i++){
            System.out.println("Iteration"+i);
        }

        int [] number={8,5,2,7,9,4,6,1,3};
        for(int i=0;i<number.length;i++){
            System.out.println("Number"+number[i]);
        }

        String [] fruits={"Apple","Banana","Cherry"};
        for(int i=0;i<fruits.length;i++){
            System.out.println("Frute"+fruits[i]);
        }

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
