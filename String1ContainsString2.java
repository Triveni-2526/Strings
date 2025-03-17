package com.triveni;

public class String1ContainsString2 {

	public static void main(String[] args) {
		
		String str1="java developer";
		String str2="developer";
		
		if(str1.contains(str2))
		{
			System.out.println("'"+str1+"'" + " Contains "+"'"+str2+"'");
		}
		else
		{
			System.out.println("'"+str1+"'" + " Not Contains "+"'"+str2+"'");
		}
	}
}
