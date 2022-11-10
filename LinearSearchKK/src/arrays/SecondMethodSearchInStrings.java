package arrays;

public class SecondMethodSearchInStrings {

	public static void main(String[] args) {
		String name ="gaurav";
		char ch='a';
		System.out.println(Search(name,ch));

	}
//method name Search
	 static boolean Search(String str, char ch) 
	 {
	if (str.length()==0) 
	//.length method returns the length of array 
	{
		return false;
	}
	for (char ele : str.toCharArray())
	//here we are using toCharArray method which converts String into array of characters
	{
		if (ele==ch) {
			return true;
			
		}
	}return false;
		
	}

}
