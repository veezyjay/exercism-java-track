import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> shake = new ArrayList<>();
        if (bitIsOne(number, 0))
            shake.add(Signal.WINK);
        if (bitIsOne(number, 1))
            shake.add(Signal.DOUBLE_BLINK);
        if (bitIsOne(number, 2))
            shake.add(Signal.CLOSE_YOUR_EYES);
        if (bitIsOne(number, 3))
            shake.add(Signal.JUMP);
        if (bitIsOne(number, 4))
            Collections.reverse(shake);

        return shake;
    }

    boolean bitIsOne (int code, int bit) {
        code = code >> bit;
        if ((code & 1) == 1) return true;

        return false;
    }

}
