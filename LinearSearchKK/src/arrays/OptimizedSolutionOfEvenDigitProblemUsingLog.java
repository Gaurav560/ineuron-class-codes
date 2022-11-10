package arrays;

public class OptimizedSolutionOfEvenDigitProblemUsingLog {

	public static void main(String[] args) {
		int[] arr=new int[] {0,22,33,5,-88,765765,654444};
		System.out.println(findNumberOfDigits(arr));

	}

	static int findNumberOfDigits(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) 
			{
				arr[i]*=-1;
				
			}
			
			int len=(int) (Math.log10(arr[i]))+1;
			if (len%2==0 ) {
				count++;
				
			}
			
		}return count;
	}

}
//(int) Math.log10(num)+1 gives no of digits in an integer .it just optimizes the code.
