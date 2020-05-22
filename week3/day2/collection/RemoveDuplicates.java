package week3.day2.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Declare a String as PayPal India
		String str = "PayPal India";
		
		//Convert it into a character array
		char[] array = str.toCharArray();
		
		//Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		//Declare a Set as dupCharSet for duplicate Character		
		Set<Character> duplicateSet = new LinkedHashSet<Character>();
		
		//Iterate character array and add it into charSet		
		for (Character eachChar : array) {
			
		//if the character is already in the charSet then, add it to the dupCharSet
			if(!charSet.add(eachChar)) 
			{
				duplicateSet.add(eachChar);
		    }
		
			}
		
		//Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(duplicateSet);
		
		//Iterate using charSet
		for (Character distinct : charSet) {
			//Check the iterator variable isn't equals to an empty space
			if(distinct!=' ')
			{
				System.out.print(distinct);
			}
			
		}
	}
}
