package com.triveni;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="madam";
		String dup=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(dup.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
