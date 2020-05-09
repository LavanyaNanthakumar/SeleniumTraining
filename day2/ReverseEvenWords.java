package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test="I am a software tester"; 
		String str[]=test.split(" ");
		String answer="";
		for(int i=0;i<=str.length-1;i++)
		{
			String word = str[i];
		
			String reverse="";			
		if(i%2!=0)
		{
		for(int j=word.length()-1;j>=0;j--)
		{
			reverse+=word.charAt(j);			
		}	
		}
		else {
			reverse+=word;
		}
				answer+=reverse+ " ";
		}
			System.out.println(answer);
		
		
		
		
	}

}
