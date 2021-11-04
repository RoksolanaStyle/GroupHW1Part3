package com.syntax.HW;

public class GroupHWCoding {

	public static void main(String[] args) {
		/*Create a 2D array of integers.
		 *  Develop a program which will calculate the sum of 
		 *   even and odd numbers for that array.
		 */
		
			int[][] num = {
					{1,2,3}, 
					{2,1,1}, 
					{1,1,3}, 
					};
			int nEven =0;
			int nOdd= 0;
			
		    for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
					
				if(num[i][j] %2 ==0) {
				nEven +=num[i][j];
				
			}else {
				nOdd+=num[i][j];
			}
		    }
	}
		    System.out.println("Sum of even numbers in an array: " + nEven);
		    System.out.println("Sum of odd numbers in an array: " + nOdd); 
			
		}
		
}


