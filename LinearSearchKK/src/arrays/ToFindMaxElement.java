package arrays;

public class ToFindMaxElement {

	public static void main(String[] args) {
	
		int [][] arr= 
			{
				{2,4,6,9},
				{23,-45,67,89},
				{54,32,21,65},
				{33,57,-28,29,99},
		};
		
	int ans=max(arr);//return the maximum value;
	System.out.println(ans);

	}

	 static int max(int[][] str) 
	 
	 {
		int max= str[0][0];
		for (int i = 0; i < str.length; i++)
		{
			for (int j = 0; j < str[i].length; j++) 
			{
				if (str[i][j]>max)
				{
					max=str[i][j];
					
				}
				
			}
			
		}return max;
		
		
	}

}
