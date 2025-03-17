package com.triveni;

public class FindLengthWithOutMethod {

	public static void main(String[] args) {
		
		
		String str="Triveni";
		
		char[] ch=str.toCharArray();
		int count=0;
		
//		System.out.println(str.length());
		
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println(count);
		
	}
}
