package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 125;		
		int sum=0;
	
		while(input!=0)
		{
			sum = sum+ input%10;
			input/=10;
		}
		System.out.println(sum);
		
	}

}
