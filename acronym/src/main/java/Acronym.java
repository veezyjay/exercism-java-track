class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String phraseWithoutHyphens = phrase.replace("-", " ");
        String[] words = phraseWithoutHyphens.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word: words) {
            String filtered = word.replaceAll("[^a-zA-Z]", "");
            if (filtered.length() > 0) {
                char firstLetter = filtered.charAt(0);
                output.append(firstLetter);
            }  
        }
        return output.toString().toUpperCase();
    }


}
