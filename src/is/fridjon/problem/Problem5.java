package is.fridjon.problem;

public class Problem5 {
    public Integer smallestMultipleForRange(int max) {
        int x = max;
        int i = 1;

        while (true) {
            while (isEvenlyDivisibleByi(i, x)) {

                if (i == max) {
                    return x;
                } else {
                    i++;
                }
            }
            i = 1;
            x++;
        }

    }

    private boolean isEvenlyDivisibleByi(int divider, int number) {
        return number % divider == 0;
    }


}
