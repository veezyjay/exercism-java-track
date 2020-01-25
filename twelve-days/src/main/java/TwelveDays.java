import java.util.HashMap;
import java.util.Map;

class TwelveDays {

    String verse(int verseNumber) {
        Map<Integer, String> lines = new HashMap<>();
        lines.put(1, "a Partridge in a Pear Tree.");
        lines.put(2, "two Turtle Doves, ");
        lines.put(3, "three French Hens, ");
        lines.put(4, "four Calling Birds, ");
        lines.put(5, "five Gold Rings, ");
        lines.put(6, "six Geese-a-Laying, ");
        lines.put(7, "seven Swans-a-Swimming, ");
        lines.put(8, "eight Maids-a-Milking, ");
        lines.put(9, "nine Ladies Dancing, ");
        lines.put(10, "ten Lords-a-Leaping, ");
        lines.put(11, "eleven Pipers Piping, ");
        lines.put(12, "twelve Drummers Drumming, ");

        String base = baseLine(verseNumber);
        StringBuilder output = new StringBuilder(base);
        int round = 0;
        for (int i = verseNumber; i > 0; i--) {
            if (i == 1 && round > 0) {
                output.append("and ");
            }
            output.append(lines.get(i));
            round++;
        }
        output.append("\n");
        return output.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder output = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            output.append(verse(i));
            if (i != endVerse) {
                output.append("\n");
            }
        }
        return output.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }

    String baseLine(int verse) {
        String output = null;
        switch (verse) {
            case 1:
                output = "first";
                break;
            case 2:
                output = "second";
                break;
            case 3:
                output = "third";
                break;
            case 4:
                output = "fourth";
                break;
            case 5:
                output = "fifth";
                break;
            case 6:
                output = "sixth";
                break;
            case 7:
                output = "seventh";
                break;
            case 8:
                output = "eighth";
                break;
            case 9:
                output = "ninth";
                break;
            case 10:
                output = "tenth";
                break;
            case 11:
                output = "eleventh";
                break;
            case 12:
                output = "twelfth";
                break;            
        }

        return "On the " +  output + " day of Christmas my true love gave to me: ";
    }
}
