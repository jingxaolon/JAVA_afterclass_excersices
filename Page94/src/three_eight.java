import java.util.*;
public class three_eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    System.out.print(
	  	      "Enter three number: ");
	    int n1 = input.nextInt();
	    int n2 = input.nextInt();
	    int n3 = input.nextInt();
	    
	    int max = 0, mid = 0, min = 0;
	    
	    //n1 > n2 ?
	    if (n1 > n2) {
	    	//n1 > n2. n2 > n3 ?
	    	if (n2 > n3) {
	    		//n2 > n3
	    		max = n1;mid = n2;min = n3;
	    	}
	    	else {
	    		if (n1 > n3) {
	    			max = n1;mid = n3;min = n2;
	    		}
	    		else {
	    			max = n3;mid = n1;min = n2;
	    		}
	    	}
	    }
	    else {
	    	if (n2 > n3) {
	    		if (n1 > n3) {
	    			max = n2;mid = n1;min = n3;
	    		}
	    		else {
	    			max = n2;mid = n3;min = n1;
	    		}
	    		max = n1;mid = n2;min = n3;
	    	}
	    	else {
	    		max = n3;mid = n2;min = n1;
	    	}
	    }
	    
	    System.out.println("three number: " + min + " " + mid + " " + max); 
	}

}
