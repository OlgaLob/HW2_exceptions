package HW2;

public class ex2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 5, 6, 8, 7, 9, 2, 1, 9};
            double catchedres1 = intArray[8] / d;
            System.out.println("catchedres1 = " + catchedres1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

