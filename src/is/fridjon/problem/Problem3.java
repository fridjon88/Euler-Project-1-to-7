package is.fridjon.problem;


public class Problem3 {


    public boolean largestPrimeFactor(long number) {
        if (number == 1 || isEven(number)) return false;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return largestPrimeFactor(number / i);
            }
        }
        System.out.println("Largest Prime Factor: "+number);
        return true;
    }

    private boolean isEven(long number) {
        return number % 2 == 0;
    }
}
