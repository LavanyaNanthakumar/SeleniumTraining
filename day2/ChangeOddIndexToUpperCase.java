package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char ch[]=test.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			char c=ch[i];
			if(i%2!=0)
			{
				c=Character.toUpperCase(test.charAt(i));
				
			}
			else {
				c=Character.toLowerCase(test.charAt(i));
				
			}
			System.out.print(c);
		}
	}

}
