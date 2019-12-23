import java.util.HashMap;
import java.util.Map;


class ResistorColorDuo {
    int value(String[] colors) {
        String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        StringBuilder valueString = new StringBuilder();
        Map<String, Integer> colorMap = new HashMap<>();
        for (int i = 0; i < colorArr.length; i++) {
            colorMap.put(colorArr[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            if (i > 1) {
                break;
            }
            int index = colorMap.get(colors[i]);
            valueString.append(index);
        }
        return Integer.parseInt(valueString.toString());
        
    }
}
