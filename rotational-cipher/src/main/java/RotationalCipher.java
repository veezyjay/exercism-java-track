class RotationalCipher {
    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        if (shiftKey == 0) return data;
        StringBuilder output = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                int base = Character.isUpperCase(c) ? 'A' : 'a';
                char newChar = (char) ((c + shiftKey - base) % 26 + base);
                output.append(newChar);
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }

}
