package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;
		int original = input;
		int cal = 0;
		int rem;
		
		while(input!=0)
		{
			rem = input%10;
			input = input/10;
			cal = cal + (rem*rem*rem);
		}
		
		if(original == cal)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
