import java.util.stream.IntStream;

class NaturalNumber {
  private int number;

  public NaturalNumber(int number) {
    if (number < 1) {
      throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }
    this.number = number;
  }

  Classification getClassification() {
    int boundary = (int) number / 2;
    int aliquotSum = IntStream.rangeClosed(1, boundary).filter(num -> this.number % num == 0).sum();

    if (aliquotSum > number) {
      return Classification.ABUNDANT;
    } else if (aliquotSum < number) {
      return Classification.DEFICIENT;
    } else {
      return Classification.PERFECT;
    }
  }

}
