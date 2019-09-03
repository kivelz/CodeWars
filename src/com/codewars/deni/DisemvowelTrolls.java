package com.codewars.deni;

public class DisemvowelTrolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "This website is for losers LOL!";
		
		System.out.println(disemvowel(word));

	}
	
	public static String disemvowel(String str) {
		
		String[] vowel = {"a","e","i","o","u","A","E","I","O","U"};
		
			for(String c : vowel)
			{
				str = str.replaceAll(c, "");
			}
		
		return str;
	
	}
}
