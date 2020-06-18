import java.util.Scanner;

public class three_seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    System.out.print("scissor (0), rock(1), paper (2): ");
	    
	    int num = input.nextInt();
	    
	    int randomComputer = (int)(Math.random() * 3);
	    //System.out.print(randomComputer);
	    
	    switch (num) {
	    case 0: 
	    	if (randomComputer == 0)
	    		System.out.print("The computer is scissor. You are scissor. It is a draw");
	    	else if (randomComputer == 1)
	    		System.out.print("The computer is rock. You are scissor. Computer won");
	    	else
	    		System.out.print("The computer is paper. You are scissor. You won");
	    	break;
	    case 1: 
	    	if (randomComputer == 0)
	    		System.out.print("The computer is scissor. You are rock. You won");
	    	else if (randomComputer == 1)
	    		System.out.print("The computer is rock. You are rock. It is a draw");
	    	else
	    		System.out.print("The computer is paper. You are rock. Computer won");
	    	break;
	    case 2: 
	    	if (randomComputer == 0)
	    		System.out.print("The computer is scissor. You are paper. Computer won");
	    	else if (randomComputer == 1)
	    		System.out.print("The computer is rock. You are paper. You won");
	    	else
	    		System.out.print("The computer is paper. You are paper. It is a draw");
	    	break;
	    }
	}

}
