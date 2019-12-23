import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> uniqueCharacters = new HashSet<>();
        String inputLowerCase = input.toLowerCase();
        for (char c : inputLowerCase.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueCharacters.add(c);
            }            
        }
        return uniqueCharacters.size() == 26;
    }

}
