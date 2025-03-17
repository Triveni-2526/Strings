package com.triveni;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		
	
	String str="hii hello how are you guys";
	
	String str1=str.replaceAll("\\s", "");
	
	System.out.println(str1);
	}
	
}
