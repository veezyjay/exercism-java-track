import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {
    private int number;
    private int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            for (int num : set) {
                if (num != 0 && i % num == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }
}
