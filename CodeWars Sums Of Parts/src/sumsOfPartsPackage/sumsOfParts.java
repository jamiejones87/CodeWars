package sumsOfPartsPackage;

import java.util.Arrays;

public class sumsOfParts {

	public static void main(String[] args) {
		int[] myArray = { 0, 1, 3, 6, 10 };
		String myString = Arrays.toString(sumParts(myArray));
		System.out.println(myString);

	}
	
	public static int[] sumParts(int[] ls) {
		int[] myReturn = new int[ls.length+1];
		for(int i=0; i<ls.length; i++) {
			myReturn[0] += ls[i];
		}
		for(int i=1; i<myReturn.length; i++) {
			myReturn[i] = myReturn[i-1] - ls[i-1];
		}
		return(myReturn);
	}

}
