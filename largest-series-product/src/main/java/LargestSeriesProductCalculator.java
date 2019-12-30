import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LargestSeriesProductCalculator {
    private String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        sanityCheck(inputNumber);
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        int length = inputNumber.length();

        if (numberOfDigits == length) {
            return getProduct(inputNumber);
        } else if (numberOfDigits > length) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        } else if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        long largestProduct = Long.MIN_VALUE;
        for (int i = 0; i <= length - numberOfDigits; i++) {
            String sequence = inputNumber.substring(i, i + numberOfDigits);
            long product = getProduct(sequence);
            if (product > largestProduct) {
                largestProduct = product;
            }
        }
        return largestProduct;
    }

    long getProduct(String input) {
        long product = 1;
        for (char c : input.toCharArray()) {
            product *= Character.getNumericValue(c);
        }
        return product;
    }

    private void sanityCheck(String inputNumber) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(inputNumber);
        if (matcher.find()) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }
}
