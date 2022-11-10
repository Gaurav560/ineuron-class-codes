package arrays;

public class RichestCustomerWealthProblem {

	public static void main(String[] args) {
		
int [][] accounts= {
		{33,55,16},
		{1,45,77,90},
		{33,88,0,54,78},
		};
System.out.println(maximumWealth(accounts));
}
	
static int maximumWealth(int[][] accounts) 
{
	int max=Integer.MIN_VALUE;
	for (int person = 0; person < accounts.length; person++) 
	{
		int wealth=0; 
		
		for (int bank = 0; bank < accounts[person].length; bank++)
		{
			
			wealth +=accounts[person][bank];
		}
		if (wealth>max) {
			max=wealth;
			
		}
	}return max;
}
}
