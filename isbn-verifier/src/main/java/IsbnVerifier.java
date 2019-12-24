class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        String stringToVerifyNoHyphens = stringToVerify.replace("-", "");
        if (stringToVerifyNoHyphens.length() != 10) return false;
        int verificationSum = 0, step = 10;
        char[] charArray = stringToVerifyNoHyphens.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            int value = Character.getNumericValue(charArray[i]);
            if (i != 9) {
                verificationSum += (value * step);
            } else {
                if (Character.isLetter(charArray[i])) {
                    // value would be 33 if the current character is either 'x' or 'X'
                    if (value == 33) {
                        verificationSum += (10 * step);
                    } else {
                        return false;
                    }
                } else {
                    verificationSum += (value * step); 
                }
            }
            step--;
        }

        return verificationSum % 11 == 0;
    }

}
