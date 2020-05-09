package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
		char ch[]=test.toCharArray();
		String reverse="";
		for (int i = ch.length-1; i >= 0; i--) {
			reverse+=ch[i];
		}
		System.out.println(reverse);
	}

}
