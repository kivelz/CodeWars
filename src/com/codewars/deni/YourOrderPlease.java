package com.codewars.deni;

public class YourOrderPlease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "4of Fo1r pe6ople g3ood the the";
		System.out.println(order(words));
	}

	public static String order(String words) {
		if (words == "")
			return "";
		String[] sArr = words.split(" ");
		String newWord = "";
		for (int i = 0; i < words.length(); i++)
			for (String string : sArr)
				if (string.contains(Integer.toString(i)))
					newWord += string + " ";
		newWord = newWord.substring(0, newWord.length() - 1);
		return newWord;
	}
}
