import java.util.Scanner;

public class Five_ThirtyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    
	    int countForPlayer = 0;
	    int countForComputer = 0;
	    
	    while (countForPlayer < 2 && countForComputer < 2) {
		    System.out.print("scissor (0), rock(1), paper (2): ");
		    
		    int num = input.nextInt();
		    
		    int randomComputer = (int)(Math.random() * 3);
		    //System.out.print(randomComputer);
		    
		    switch (num) {
		    case 0: 
		    	if (randomComputer == 0)
		    		System.out.print("The computer is scissor. You are scissor. It is a draw");
		    	else if (randomComputer == 1) {
		    		System.out.print("The computer is rock. You are scissor. Computer won");
		    		countForComputer++;
		    	}
		    	else {
		    		System.out.print("The computer is paper. You are scissor. You won");
		    		countForPlayer++;
		    	}
		    		
		    	break;
		    case 1: 
		    	if (randomComputer == 0) {
		    		System.out.print("The computer is scissor. You are rock. You won");
		    		countForPlayer++;
		    	}
		    	else if (randomComputer == 1)
		    		System.out.print("The computer is rock. You are rock. It is a draw");
		    	else {
		    		System.out.print("The computer is paper. You are rock. Computer won");
		    		countForComputer++;
		    	}
		    	break;
		    case 2: 
		    	if (randomComputer == 0) {
		    		System.out.print("The computer is scissor. You are paper. Computer won");
		    		countForComputer++;
		    	}
		    	else if (randomComputer == 1) {
		    		System.out.print("The computer is rock. You are paper. You won");
		    		countForPlayer++;
		    	}
		    	else
		    		System.out.print("The computer is paper. You are paper. It is a draw");
		    	break;
		    }
		    
		    System.out.print("\n");
	    }
	    if (countForPlayer == 2) {
	    	System.out.print("you wins computer twice");
	    }
	    else {
	    	System.out.print("computer wins you twice");
	    }
	    
	}

}
