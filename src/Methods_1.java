
public class Methods_1 {

	public static void main(String[] args) {
		
		String firstName = "John";
		String lastName = "Rotten";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
	}
	
	public static String concat (String word, int n) {
		String allWords = "";
		for (int i = 0; i < n; i++) {
		allWords += word;
		}
	 return allWords;
	}
	
	public static String createFullName (String x, String y) {
		return x + " " + y;
	}

	public static boolean totalSum (int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum > 100;
	}
	
	public static double averageElements (double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		
		return sum / numbers.length;
		
	}
	
	public static boolean greaterTwoArrays (double[] firstNumbers, double[] secondNumbers) {
		double firstNumberSum = 0;
		for (double firstnumber : firstNumbers) {
			firstNumberSum += firstnumber;
		}
		double secondNumberSum = 0;
		for (double secondNumber : secondNumbers) {
			secondNumberSum += secondNumber;
		}
		
		return firstNumberSum > secondNumberSum;
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
		
	}
	
	// This method checks to see if it is hot outside. It sets a hot temperature at 85 degrees and checks if the current
	// temperature is above it and returns true if it is.
	
	public static boolean isHotOutside (double temperature) {
		double hotTemperature = 85;
		return temperature > hotTemperature;
	}
	
}
