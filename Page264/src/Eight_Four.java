
public class Eight_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[][] hours = {
	  	      {2, 4, 3, 4, 5, 8, 8},
	  	      {7, 3, 4, 3, 3, 4, 4},
	  	      {3, 3, 4, 3, 3, 2, 2},
	  	      {9, 3, 4, 7, 3, 4, 1},
	  	      {3, 5, 4, 3, 6, 3, 8},
	  	      {3, 4, 4, 6, 3, 4, 4},
	  	      {3, 7, 4, 8, 3, 8, 4},
	  	      {6, 3, 5, 9, 2, 7, 9}};
	    
	    int[][] sumHours = new int[hours.length][2];
	    
	    //calculate sum
	    int i;
	    for (i = 0;i < hours.length;i++) {
	    	int sum = 0;
	    	for (int j = 0;j < hours[i].length;j++) {
	    		sum += hours[i][j];
	    	}
	    	sumHours[i][0] = i;
	    	sumHours[i][1] = sum;
	    }
	    
	    for (i = 0;i < sumHours.length - 1;i++) {
	    	int swap = 0;
	    	for (int j = i + 1;j < sumHours.length;j++) {
	    		if (sumHours[i][1] < sumHours[j][1]) {
	    			swap = sumHours[i][1];
	    			sumHours[i][1] = sumHours[j][1];
	    			sumHours[j][1] = swap;
	    			
	    			swap = sumHours[i][0];
	    			sumHours[i][0] = sumHours[j][0];
	    			sumHours[j][0] = swap;
	    		}
	    	}
	    }
	    
	    for (i = 0;i < sumHours.length;i++) {
	    	System.out.println("Employee " + sumHours[i][0] + "'s total productive hours is " +
	    			sumHours[i][1]);
	    }
	}

}
