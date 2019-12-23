class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String numString = String.valueOf(numberToCheck);
		int length = numString.length();
		int output = 0;
		for (char c: numString.toCharArray()) {
			int currentDigit = Character.getNumericValue(c);
			output += Math.pow(currentDigit, length);
		}

		return output == numberToCheck;
		
	}

}
