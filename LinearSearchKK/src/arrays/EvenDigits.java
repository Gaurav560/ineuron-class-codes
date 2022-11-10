package arrays;

public class EvenDigits {

	public static void main(String[] args) {
		//normal method of finding evenDigit numbers in an array
		int[] nums= {-8,6,0,33,-55,234,5432,-665446,78986};
		System.out.println(findNumbers(nums));
	

	}
	static int findNumbers(int [] nums) 
	{
		 
		int digit=0;
		for (int i = 0; i < nums.length; i++)
		{
			 //negative edge case discussed here
	        	 if (nums[i]<0) {
	        		 nums[i] *=-1;
					
	        	 }
			int count=0;
			int temp=nums[i];
			while (nums[i]>0)
			{
				count++;
				nums[i]=nums[i]/10;
				
			}
			if (count%2==0 && temp!=0) 
			{
				digit++;
				
			}
			
		}
		return digit;
	}

}
