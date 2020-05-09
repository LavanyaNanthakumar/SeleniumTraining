package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "madam";
		String reverse="";
		char ch[]=test.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			reverse+=ch[i];
		}
		System.out.println(reverse);
		if(test.equalsIgnoreCase(reverse))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
