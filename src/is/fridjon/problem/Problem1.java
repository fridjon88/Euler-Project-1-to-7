package is.fridjon.problem;

import java.util.ArrayList;

public class Problem1 {
    public static void printSolution() {
        int maximum = 1000;
        ArrayList<Integer> multiplesOfThreeOrFive;
        multiplesOfThreeOrFive = findMultiplesOfThreeAndFiveBelowTargetNumber(maximum);
        System.out.println("Problem one: "+sumOfList(multiplesOfThreeOrFive));

    }

    private static ArrayList<Integer> findMultiplesOfThreeAndFiveBelowTargetNumber(int targetNumber) {
        ArrayList<Integer> multiplesOfThreeOrFive = new ArrayList<>();

        for (int i = 0; i < targetNumber; i++) {
            if (i % 3 == 0) {
                multiplesOfThreeOrFive.add(i);
            } else if (i % 5 == 0) {
                multiplesOfThreeOrFive.add(i);
            }
        }
        return multiplesOfThreeOrFive;
    }

    private static Integer sumOfList(ArrayList<Integer> integers) {
        int total = 0;
        for (Integer integer : integers) {
            total = total + integer;
        }
        return total;
    }
}
