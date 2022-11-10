package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array:");
		int length=sc.nextInt();
		System.out.println("enter the no of elements every inner array holds:");
		int noOfElements=sc.nextInt();
	int [][] arr= new int[length][noOfElements];
	System.out.println("please enter the value of elements:");
	for (int  i= 0;  i< arr.length; i++)
	{
		for (int j = 0; j < arr[i].length; j++)
		{
			arr[i][j]=sc.nextInt();
		}
		System.out.println(Arrays.deepToString(arr));
		
	}
	System.out.println("enter the target to be searched:");
	int target=sc.nextInt();
	System.out.println("enter the lower bound index from which u want to find the element:");
	int lowerBound=sc.nextInt();
	System.out.println("enter the upper bound index upto which u want to find the element:");
	int upperBound=sc.nextInt();
	System.out.println(search(arr,target,lowerBound,upperBound));

	}

	 static boolean search(int[][] str,int element,int lb,int ub)
	 {
		for (int i = lb; i <=ub; i++)
		{
			for (int j = 0; j < str[i].length; j++) 
			{
				if (element==str[i][j]) 
				{
					System.out.println("the element is in this  array.");
					return true;
				}
				
			}
			
		}System.out.println("oops! the element is not in the array.");
		return false;
	
	}

}
