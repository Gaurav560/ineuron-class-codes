package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int length=sc.nextInt();
		int [] arr=new int[length];
		System.out.println("enter the elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("the maximum of all the elements in the array is: "+maximum(arr));
		

	}
//maximum method body and declaration
	 static int maximum(int[] str) {
		 int max=str[0];
		for (int i = 1; i < str.length; i++) {
			if (max<str[i]) 
			{
				max=str[i];
				
			}
			
			
		}return max;
		
	}

}
