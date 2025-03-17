package com.triveni;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str="ttriv";
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			boolean result=true;
			for(int j=0;j<ch.length;j++)
			{
				if(i!=j&&ch[i]==ch[j])
				{
					result=false;
				}
			}
			if(result)
			{
				System.out.println("First Non Repeated Character :: "+ch[i]);
				break;
			}
		}
	}
}
