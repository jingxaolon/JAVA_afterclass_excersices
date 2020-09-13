import java.util.Scanner;

public class Five_FortyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a string: ");
	    String stringInput = input.nextLine();
	    
	    //fuyin
	    int numberOfConsonant = 0;
	    //yuanyin
	    int numberOfVowel = 0;
	    
	    int i;
	    for (i = 0;i <= stringInput.length() - 1;i++) {
	    	char temp = stringInput.charAt(i);
	    	
	    	if (!Character.isLetter(temp)) {
	    		continue;
	    	}
	    	else if (Character.toUpperCase(temp) == 'A'
	    			|| Character.toUpperCase(temp) == 'E'
	    			|| Character.toUpperCase(temp) == 'I'
	    			|| Character.toUpperCase(temp) == 'O'
	    			|| Character.toUpperCase(temp) == 'U') {
	    		numberOfVowel++;
	    	}
	    	else {
	    		numberOfConsonant++;
	    	}
	    }
	    
	    System.out.println("The number of vowels is " + numberOfVowel);
	    System.out.println("The number of consonants is " + numberOfConsonant);
	}

}
