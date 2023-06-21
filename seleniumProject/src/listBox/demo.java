package listBox;

import java.util.ArrayList;

public class demo 
{
	

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("mithun");
		a1.add("vaibhav");
		a1.add("santosh");
		System.out.println(a1.size());
		for(String s1:a1)
		{
			System.out.println(s1.toUpperCase());
		}
	}

}