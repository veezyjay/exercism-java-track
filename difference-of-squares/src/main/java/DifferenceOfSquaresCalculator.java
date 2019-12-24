import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // int sum = IntStream.rangeClosed(1, input).sum();
        // return sum * sum;
        return (int) Math.pow(input * ( input +1 ) / 2,2);
    }

    int computeSumOfSquaresTo(int input) {
        // return IntStream.rangeClosed(1, input).map(item -> item * item).sum();
        return  input * (input + 1) * (2 * input + 1) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
