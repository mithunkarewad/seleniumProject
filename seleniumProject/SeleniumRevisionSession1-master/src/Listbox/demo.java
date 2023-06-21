package Listbox;

import java.util.ArrayList;

public class demo 
{
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("rahul");
		al.add("mahesh");
		al.add("ramesh");
		
		System.out.println(al.size());
		
		
		for(String s1:al)
		{
			System.out.println(s1.toUpperCase());
		}
		
	}

}
