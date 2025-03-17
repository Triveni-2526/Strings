package com.triveni;

public class DuplicatesCounts {

	public static void main(String[] args) {
		
		String s="Trivenie";
		
		char[] ch=s.toCharArray();
		
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
		}
		System.out.println("Duplicates counts :: "+count);
	}
}
