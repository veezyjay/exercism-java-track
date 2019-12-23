import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger grains = new BigInteger("1");
        for (int i = 1; i < square; i++) {
            grains = grains.multiply(BigInteger.valueOf(2));
        } 
        return grains;
    }

    BigInteger grainsOnBoard() {
        BigInteger total = new BigInteger("1");
        for (int i = 2; i <= 64; i++) {
            total = total.add(grainsOnSquare(i));
        }
        return total;
    }

}
