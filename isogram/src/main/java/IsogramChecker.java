import java.util.ArrayList;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        ArrayList<Character> charList = new ArrayList<>();
        String phraseInLower = phrase.toLowerCase();
        int phraseLength = phraseInLower.length();
        for (int i = 0; i < phraseLength; i++ ) {
            char c = phraseInLower.charAt(i);
            boolean isSpaceOrHyphen = (c == ' ' || c == '-');
            if (isSpaceOrHyphen || !charList.contains(c)) {
                charList.add(c);
            } else {
                break;
            }
        }
        return charList.size() == phraseLength;
    }

}
