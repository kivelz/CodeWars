package com.codewars.deni;

import java.util.ArrayList;
import java.util.LinkedList;

public class Printsqrtofeachnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9119;
		
		System.out.println(SqrtofNum(9119));
	}
	public static int SqrtofNum(int n) {
		String number = String.valueOf(n);
		String[] numArr = number.split("");
		String output = "";
		
		for (String string : numArr) {
			int i = Integer.parseInt(string);
			output += i*i;
		}	
		return Integer.parseInt(output);
	}

}
