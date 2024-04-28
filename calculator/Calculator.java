package calculator;

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		double a=sc.nextDouble();
		System.out.println("Enter second number:");
		double b=sc.nextDouble();
		System.out.println("Give any one operation(+,-,*,/)");
		char c=sc.next().charAt(0);
		double result;
		try {
			switch(c) {
				case '+':
				{
					result=a+b;
					System.out.println("Addition of two numbers: "+ result );
					break;
				}
				case '-':
				{
					result=a-b;
					System.out.println("Subtraction of two numbers: "+result);
					break;
				}
				case '*':
				{
					result=a*b;
					System.out.println("Multiplication of two numbers: "+result);
					break;
				}
				case '/':
				{
					if(b == 0) {
						throw new ArithmeticException("Error!!!Cannot divide by zero!!!");
					}
					result=a/b;
					System.out.println("Division of two numbers: "+result);
					break;
				}
				default:
					throw new IllegalArgumentException("Error!!!Invalid operator!!!");
			}
		}
		catch(Exception e) {
			System.out.println("Exception message:"+e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
