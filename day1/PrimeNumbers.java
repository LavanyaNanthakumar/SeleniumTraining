package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 13;
		int flag=0;
		int half = input/2;
		
		if(input==0||input==1)
		{  
			   System.out.println(input+" is not prime number");      
		}
		else
		{ 			  
		for(int i=2;i<=half;i++)
		{
			if(input%i==0)
			{      
			     System.out.println(input+" is not prime number");      
			     flag=1;  
			     break;
			}
		}
			if(flag==0)
			{
				System.out.println(input+" is a prime number"); 
			}
		}
	
	}

}
