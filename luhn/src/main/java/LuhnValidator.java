class LuhnValidator {

    boolean isValid(String candidate) {
        String strippedCandidate = candidate.replace(" ", "");
        int candidateLength = strippedCandidate.length();
        if (candidateLength < 2) return false;
        int sum = 0;

        for (int i = candidateLength - 1; i >= 0; i--) {
            char currentChar = strippedCandidate.charAt(i);
            if (!Character.isDigit(currentChar)) return false;

            int currentNumber = Character.getNumericValue(currentChar);

            if ((candidateLength - i) % 2 == 1) {
                sum += currentNumber;
            } else {
                int doubled = currentNumber * 2;
                if (doubled > 9) {
                    sum += (doubled - 9);
                } else {
                    sum += doubled;
                }
            }
        }

        return sum % 10 == 0;
    }

}
