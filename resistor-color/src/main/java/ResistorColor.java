class ResistorColor {
    int colorCode(String color) {
        String[] colorsArr = colors();
        int code = -1;
        for (int i = 0; i < colorsArr.length; i++) {
            if (colorsArr[i].equalsIgnoreCase(color)) {
                code = i;
                break;
            }
        }
        return code;
    }

    String[] colors() {
        String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colorArr;
    }
}
