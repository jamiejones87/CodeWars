package romanNumeralsEncoderPackage;

public class romanNumeralsEncoder {

	public static void main(String[] args) {
		int myNum = 1989;
		System.out.println(romanEncoder(myNum));
	}
	
	public static String romanEncoder(int myNum) {
		char[] myNumerals = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] myNums = new int[4];
		for(int i=0; i<4; i++) {
			myNums[i] = (int) Math.floor(myNum/(Math.pow(10,i))) % 10;
		}
		
		String myRoman = "";
		for(int i=3; i>=0; i--) {
			int my5Test = (int) Math.floor(myNums[i]/5);
			int myDigits = myNums[i] % 5;
			if((my5Test == 1)&&(myDigits != 4)) {
				myRoman += myNumerals[(i*2)+1];
			}
			if(myDigits != 0) {
				if(myDigits != 4) {
					for(int n=0; n<myDigits; n++) {
						myRoman += myNumerals[i*2];
					}
				} else {
					myRoman += myNumerals[(i*2)];
					myRoman += myNumerals[(i*2)+(my5Test+1)];
				}
			}
		}

		return myRoman;
	}

}
