package arrays;

public class LinearSearchSearchInStrings {

	public static void main(String[] args) {
		//search character in string
		//if character exists return true else false
		String name ="Gaurav";
		char target ='G';
		System.out.println(Search(name, target));

	}
	static boolean Search(String str,char target)
	
	//note-jahan pe return use hota hai method mein bahut baar wahan pe ek hi baar
	//agar kahin pe bhi command return pe chal jaata jai to wahan pe 
	//se wo function khatm ho jaata hai .
	//neeche function mein koi ek bhi baar return chalega uske baad wo method khatm ho jaayega
	{
		if (str.length()==0)
		{
			return false;
			
		}
		
			for (int i = 0; i < str.length(); i++)
			{
				if (target==str.charAt(i) ) 
				{
					return true;
					
				}
			
		}
			return false;
	}

}
