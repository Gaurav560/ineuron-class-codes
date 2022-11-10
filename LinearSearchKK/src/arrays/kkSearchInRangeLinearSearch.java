package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class kkSearchInRangeLinearSearch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int length=sc.nextInt();
		System.out.println("enter the elements to be stored in array:");
	int[] arr=new int[length];
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i]=sc.nextInt();
		
		
	}System.out.println("the array is :"+Arrays.toString(arr));
	System.out.println("enter the target to be searched in range of index from startIndex to endIndex:");
	int target =sc.nextInt();
	System.out.println("enter the start index:");
	int start=sc.nextInt();
	System.out.println("enter the end index:");
	int end=sc.nextInt();
	System.out.println(Search(arr,target,start,end));

	}

	 static boolean Search(int[] str, int element,int startIndex, int endIndex)
	 {
		if (str.length==0) 
		{
			System.out.println("oops! the length of the array is equals to zero.");
			return false;
			
		}
		
		for (int i = startIndex; i <=endIndex; i++)
		{
			if (element==str[i])
			{
				System.out.println("yes this element is present in this range.");
				return true;
				
				
			}
			
		}System.out.println("this element is not present in this range.");
		return false;
	}
	

}
