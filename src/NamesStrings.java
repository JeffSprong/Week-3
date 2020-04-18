
public class NamesStrings {

	public static void main(String[] args) {
		
		String [] names = new String [6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		
		
	//	double sum = 0;
		
	//	for (String name : names) {
	//		double wordLength = name.length();
	//		sum += wordLength;
			
	//		}
		
	//	double average = sum / names.length;
	//	System.out.println("The average number of letters per name is: " + average);
	//

	//	String allNames = "" ;
		
	//	for (String name : names) {
	//		allNames += name + " ";
	//	}
	//		System.out.println(allNames);
			
		int [] nameLengths = new int[names.length];
	
		for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
	    	System.out.println(nameLengths[i]);
	}
		
		int secondSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			secondSum += nameLengths[i];
	} 
		System.out.println(secondSum);
		
		}
				
	}			
	

