package module_2_fundamentals.control_flow;

public class BreakContinueExample {
    public static void main(String[] arg) {

        for (int i = 0; i <= 20; i += 2) {

            if (i == 10) {
                System.out.println("10th element is skipped");
                continue;
            }

            if (i == 14) {
                break; // (won't occur since i increases by 2)
            }

            System.out.println("Value: " + i);
        }
    }
}
