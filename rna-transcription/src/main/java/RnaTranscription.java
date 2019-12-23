import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<Character, Character> strandMap = new HashMap<>();
        strandMap.put('G', 'C');
        strandMap.put('C', 'G');
        strandMap.put('T', 'A');
        strandMap.put('A', 'U');

        StringBuilder result = new StringBuilder();
        for (char c: dnaStrand.toCharArray()) {
            result.append(strandMap.get(c));
        }

        return result.toString();
    }

}
