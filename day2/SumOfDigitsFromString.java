package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Tes12Le79af65";
		String replaced=test.replaceAll("[^0-9]","");
		char ch[]=replaced.toCharArray();
		int sum=0;
		
		for(int i=0;i<ch.length;i++)
		{
			int a=Character.getNumericValue(ch[i]); 			
			sum+=a;
		}
		   System.out.println(sum);			
		
	}

}
