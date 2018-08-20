package is.fridjon.problem;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Problem4 {

    public Integer findBiggestPalindromeThatIsProductOfTwoNumbers(int x, int y) {
        ArrayList<Integer> palindromes = new ArrayList<>();
        for (int i = x; i > 0; i--) {
            for (int j = y; j > 0; j--) {
                if (isPalindrome(findProduct(i, j))) {
                    palindromes.add(findProduct(i, j));
                }
            }
        }
        return findBiggestPalindrome(palindromes);
    }

    private Integer findBiggestPalindrome(ArrayList<Integer> palindromes) {
        if (palindromes.isEmpty()) {
            return 0;
        } else {
            return palindromes
                    .stream()
                    .mapToInt(v -> v)
                    .max().
                            orElseThrow(NoSuchElementException::new);
        }

    }

    private boolean isPalindrome(Integer integer) {
        String number = integer.toString();
        String firstPart;
        String secondPart;
        int numberLength = number.length();
        if (integer.toString().length() % 2 == 0) {
            firstPart = number.substring(0, numberLength / 2);
            secondPart = flipString(number.substring(numberLength / 2));
        } else {
            firstPart = number.substring(0, numberLength / 2);
            secondPart = flipString(number.substring(numberLength / 2));
        }
        return compareStringParts(firstPart, secondPart);
    }

    private String flipString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private boolean compareStringParts(String firstPart, String secondPart) {
        return firstPart.equals(secondPart);
    }

    private Integer findProduct(int x, int y) {
        return x * y;
    }

}
