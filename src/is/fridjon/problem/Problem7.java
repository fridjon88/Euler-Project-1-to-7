package is.fridjon.problem;

public class Problem7 {

    public void findPrimeInSequenece(int placeInSequence) {
        System.out.println(findPrimeWithNumber(placeInSequence));
    }

    private Integer findPrimeWithNumber(int placeInSequence) {
        int counter = 0;
        int naturalNumber = 1;

        while (counter <= placeInSequence-1) {
            naturalNumber++;
            if (isPrime(naturalNumber)) {
                counter++;
            }
        }
        return naturalNumber;
    }

    private boolean isPrime(int naturalNumber) {
        for (int i = 2; i < naturalNumber; i++) {
            if (naturalNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
