class RaindropConverter {

    String convert(int number) {
        String output = "";
        boolean hasThreeAsFactor = number % 3 == 0;
        boolean hasFiveAsFactor = number % 5 == 0;
        boolean hasSevenAsFactor = number % 7 == 0;

        if (!hasThreeAsFactor && !hasFiveAsFactor && !hasSevenAsFactor) {
            output += number;
        } else {
            if (hasThreeAsFactor) {
                output += "Pling";
            }
            if (hasFiveAsFactor) {
                output += "Plang";
            }
            if (hasSevenAsFactor) {
                output += "Plong";
            }
        }
        return output;
    }
}
