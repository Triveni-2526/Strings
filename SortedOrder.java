package com.triveni;


public class SortedOrder {

	public static void main(String[] args) {
		
		String str="triveni";
		char temp;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			}
		System.out.print(ch[i]);
		}
	}
}
