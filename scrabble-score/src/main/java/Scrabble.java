import java.util.HashMap;
import java.util.Map;

class Scrabble {
    private String word;
    private Map<Character, Integer> scoreMap;

    Scrabble(String word) {
        this.word = word;
        initScoreMap();
    }

    int getScore() {
        String wordInUpperCase = word.toUpperCase(); 
        int score = 0;
        for (char c : wordInUpperCase.toCharArray()) {
            if (Character.isLetter(c)) {
                score += scoreMap.get(c);
            }
        }
        return score;
    }

    void initScoreMap() {
        scoreMap = new HashMap<>();
        scoreMap.put('A', 1);
        scoreMap.put('E', 1);
        scoreMap.put('I', 1);
        scoreMap.put('O', 1);
        scoreMap.put('U', 1);
        scoreMap.put('L', 1);
        scoreMap.put('N', 1);
        scoreMap.put('R', 1);
        scoreMap.put('S', 1);
        scoreMap.put('T', 1);
        scoreMap.put('D', 2);
        scoreMap.put('G', 2);
        scoreMap.put('B', 3);
        scoreMap.put('C', 3);
        scoreMap.put('M', 3);
        scoreMap.put('P', 3);
        scoreMap.put('F', 4);
        scoreMap.put('H', 4);
        scoreMap.put('V', 4);
        scoreMap.put('W', 4);
        scoreMap.put('Y', 4);
        scoreMap.put('K', 5);
        scoreMap.put('J', 8);
        scoreMap.put('X', 8);
        scoreMap.put('Q', 10);
        scoreMap.put('Z', 10);
    }

}
