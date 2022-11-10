package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KKMethodSearchIn2DArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [][] arr= 
			{
				{2,4,6,9},
				{23,-45,67,89},
				{54,32,21,65},
				{33,57,-28,29,99},
		};
		System.out.println("enter the value of target to check if it is present in the array: ");
		
	int target=sc.nextInt();
	int[] ans=search(arr, target);//format of return value {row,column};
	System.out.println(Arrays.toString(ans) );

	}

	 static int[] search(int[][] str, int target) 
	 {
		for (int i = 0; i < str.length; i++)
		{
			for (int j = 0; j < str[i].length; j++) 
			{
				if (str[i][j]==target)
				{
					return new int[]{i,j};
					
				}
				
			}
			
		}System.out.println("oops! it is not present in the array.");
		return new int[] {-1,-1} ;
		
	}

}
