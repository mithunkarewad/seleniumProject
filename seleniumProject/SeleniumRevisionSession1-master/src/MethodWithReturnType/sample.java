package MethodWithReturnType;

public class sample 
{
	public static void main(String[] args)
	{
		int num1 = add(10, 20);
		System.out.println(num1);
				
		System.out.println(add(5, 6));
		
		System.out.println("--------------");
		
		String s2 = convertNameToCaps("abcd");
		System.out.println(s2);
		
		System.out.println(convertNameToCaps("xyz"));
		
		System.out.println("------------------------");
		
		sample s=new sample();
		int num5 = s.mult(4, 3);
		System.out.println(num5);
		
		System.out.println(s.mult(2, 9));
	}
	
	
	//method with string return type
	public static String convertNameToCaps(String name) 
	{
		String s1 = name.toUpperCase();
		return s1;
	}
		
	
	//method with int return type
	public static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}	
	
	
	public int mult(int a, int b) 
	{
		int c=a*b;
		return c;
	}	
}
