
public class NumbersArray {

	public static void main(String[] args) {
		
		int [] ages = new int [9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 127;
		
		System.out.println(ages[ages.length -1] - ages[0]);
		
		double sum = 0;
		
		for (double age : ages) {
			sum += age;
		}
		
		double average = sum / ages.length;
		System.out.println("The average age is: " + average);
		
	}
	

}
