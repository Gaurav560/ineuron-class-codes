package arrays;

public class EvenDigitsByStringMethod {

	public static void main(String[] args) {
		int[] nums=new int[]{7,-8,0,44,55,-2345,677,54321,-567543};
		System.out.println("the no of numbers in array having even number of digits is:"+findEvenDigits(nums));

	}

	 static int findEvenDigits(int[] nums) {
		int even=0;
         for (int i = 0; i < nums.length; i++)
         {//negative edge case discussed here
        	 if (nums[i]<0) {
        		 nums[i] *=-1;
				
			}
        	 int len=String.valueOf(nums[i]).length();
        	 if (len%2==0) 
        	 {
        		 even++;
				
			}
			
		}return even;
	}

}
//String.valueOf makes any primitive data to string type.
//.length method returns the length of the string
