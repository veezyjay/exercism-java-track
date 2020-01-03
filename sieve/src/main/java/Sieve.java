import java.util.ArrayList;
import java.util.List;

class Sieve {
    private int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        boolean[] range = new boolean[maxPrime + 1];

        for (int i = 0; i <= maxPrime; i++) {
            range[i] = true;
        }

        for (int j = 2; j*j <= maxPrime; j++) {
            if (range[j] == true) {
                for (int k = j*2; k <= maxPrime; k+=j) {
                    range[k] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++) {
            if (range[i] == true) {
                primes.add(i);
            }
        }

        return primes;

    }

}
