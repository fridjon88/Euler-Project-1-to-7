package is.fridjon.problem;

public class Problem6 {
    public Integer sumOfSquares(int naturalRangeMax) {
        int sumOfSquares = findSumOfSquares(naturalRangeMax);
        int sumOfSquaresSquared = findSquareOfSumOfRange(naturalRangeMax);
        System.out.println("sumOfSquares: " + sumOfSquares +"\nsumOfSquaresSquared: " + sumOfSquaresSquared);
        return sumOfSquaresSquared - sumOfSquares;
    }


    private int findSumOfSquares(int naturalRangeMax) {
        int sum = 0;
        for (int i = 1; i <= naturalRangeMax; i++) {
            sum = sum + findSquareOfNaturalNumber(i);
        }
        return sum;
    }


    private int findSquareOfSumOfRange(int naturalRangeMax) {
        int sum = 0;
        for (int i = 1; i <= naturalRangeMax; i++) {
            sum = sum + i;
        }
        return findSquareOfNaturalNumber(sum);
    }


    private Integer findSquareOfNaturalNumber(int sumOfSquares) {
        return (int) Math.pow(sumOfSquares, 2);
    }

}
