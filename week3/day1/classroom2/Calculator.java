package week3.day1.classroom2;

public class Calculator {
	
	public int addMethod1(int num1, int num2) {
		// TODO Auto-generated method stub
		int add = num1+num2;
		return(add);
	}
	
	public int addMethod2(int value1, int value2, int value3) {
		int add = value1 + value2 +value3;
		return(add);
	}
	
	public int multiplyMethod1(int num1, int num2) {
		// TODO Auto-generated method stub
		int mul = num1*num2;
		return(mul);
	}
	
	public double multiplyMethod2(int num1, double num2) {
		
		double mul = num1*num2;
		return(mul);
	}
	
	public int subtractMethod1(int num1, int num2) {
		
		int diff = num1-num2;
		return(diff);
	}
	
	public double subtractMethod2(double num1, double num2) {
		
		double diff = num1-num2;
		return(diff);
	}
	
	public int divideMethod1(int num1, int num2) {
		
		int div = num1/num2;
		return(div);
	}
	
	public double divideMethod2(double num1, int num2) {
		
		double div = num1/num2;
		return(div);
	}
	
	public static void main(String args[]) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Sum of two numbers is " +cal.addMethod1(4, 8)); 
        System.out.println("Sum of three numbers is " +cal.addMethod2(4, 8,2)); 
        
        System.out.println("Multiplication of two numbers is " +cal.multiplyMethod1(4, 8)); 
        System.out.println("Multiplication of two numbers is " +cal.multiplyMethod2(4, 122)); 
        
        System.out.println("Subtraction of two numbers is " +cal.subtractMethod1(8, 4)); 
        System.out.println("Subtraction of two numbers is " +cal.subtractMethod2(4, 2)); 
        
        System.out.println("Division of two numbers is " +cal.divideMethod1(100, 5)); 
        System.out.println("Division of two numbers is " +cal.divideMethod2(120, 5)); 
        
	}
	

}
