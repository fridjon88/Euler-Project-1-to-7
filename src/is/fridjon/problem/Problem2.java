package is.fridjon.problem;

public class Problem2 {
    public static void printSolution() {
        System.out.println("Problem 2: "+ findFibonacciSequence(4000000).toString());
    }

    private static Integer findFibonacciSequence(int maxValue) {
        int first = 0;
        int second = 1;
        int third;
        int sum = 0;

        for (int i = first; i <= maxValue; i = first + second) {
            third = first + second;
            if (third % 2 == 0) {
                sum = sum + first + second;
            }

            first = second;
            second = third;
        }
        return sum;
    }
}
