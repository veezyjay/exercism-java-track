class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder output = new StringBuilder();
        int length = words.length;
        for (int i = 0; i < length - 1; i++) {
            output.append("For want of a " + words[i] + " the " + words[i+1] + " was lost.\n");
        }
        if (length > 0) {
            output.append("And all for the want of a "+ words[0] + ".");
        }
        return output.toString();
    }

}
