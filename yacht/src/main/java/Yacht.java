import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Yacht {
    private int[] dice;
    private YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        if (yachtCategory.equals(YachtCategory.ONES)) {
            return scoreForOnes();
        } else if (yachtCategory.equals(YachtCategory.TWOS)) {
            return scoreForTwos();
        } else if (yachtCategory.equals(YachtCategory.THREES)) {
            return scoreForThrees();
        } else if (yachtCategory.equals(YachtCategory.FOURS)) {
            return scoreForFours();
        } else if (yachtCategory.equals(YachtCategory.FIVES)) {
            return scoreForFives();
        } else if (yachtCategory.equals(YachtCategory.SIXES)) {
            return scoreForSixes();
        } else if (yachtCategory.equals(YachtCategory.FULL_HOUSE)) {
            return scoreForFullHouse();
        } else if (yachtCategory.equals(YachtCategory.FOUR_OF_A_KIND)) {
            return scoreForFourOfAKind();
        } else if (yachtCategory.equals(YachtCategory.YACHT)) {
            return scoreForYatch();
        } else if (yachtCategory.equals(YachtCategory.CHOICE)) {
            return scoreForChoice();
        } else if (yachtCategory.equals(YachtCategory.LITTLE_STRAIGHT)) {
            return scoreForLittleStraight();
        } else {
            return scoreForBigStraight();
        }
    }

    int scoreForOnes() {
        return scoreForNumber(1);
    }

    int scoreForTwos() {
        return scoreForNumber(2);
    }

    int scoreForThrees() {
        return scoreForNumber(3);
    }

    int scoreForFours() {
        return scoreForNumber(4);
    }

    int scoreForFives() {
        return scoreForNumber(5);
    }

    int scoreForSixes() {
        return scoreForNumber(6);
    }

    int scoreForNumber(int number) {
        int count = 0;
        for (int value : dice) {
            if (value == number) count++;
        }
        return count * number;
    }

    int scoreForYatch() {
        int firstDice = dice[0];
        boolean sameFaces = true;
        for (int i = 1; i < dice.length; i++) {
            if (dice[i] != firstDice) {
                sameFaces = false;
                break;
            }
        }
        return sameFaces ? 50 : 0;
    }

    int scoreForChoice() {
        int score = Arrays.stream(dice).sum();
        return score;
    }

    int scoreForLittleStraight() {
        return scoreForStraights(1, 5);
    }
    
    int scoreForBigStraight() {
        return scoreForStraights(2, 6);
    }

    int scoreForStraights(int start, int end) {
        int[] diceClone = dice.clone();
        Arrays.sort(diceClone);
        if (diceClone[0] != start || diceClone[4] != end) return 0;
        boolean correctSequence = true;
        for (int i = 1; i < 4; i++) {
            if ((diceClone[0] + i) != diceClone[i]) {
                correctSequence = false;
                break;
            }
        }
        return correctSequence ? 30 : 0;
    }

    int scoreForFourOfAKind() {
        int uniqueCount = 0;
        int repeatingDiceCount = 0;
        int firstDice = dice[0];
        int score = dice[0];
        boolean atLeastFourEqual = true;
        for (int i = 1; i < dice.length; i++) {
            if (dice[i] == firstDice) {
                repeatingDiceCount++;
                if (repeatingDiceCount < 4) {
                    score += dice[i];
                }
            } else {
                uniqueCount++;
            }
            if (uniqueCount > 1) {
                atLeastFourEqual = false;
                break;
            }
        }
        return atLeastFourEqual ? score : 0;
    }

    int scoreForFullHouse() {
        Map<Integer, Integer> diceMap = new HashMap<>();
        int sum = 0;
        for (int diceFace : dice) {
            diceMap.merge(diceFace, 1, Integer::sum);
            sum += diceFace;
        }
        boolean isFullHouse = (diceMap.size() == 2 && (diceMap.get(dice[0]) == 2 || diceMap.get(dice[0]) == 3));
        return isFullHouse ? sum : 0;
    }

}
