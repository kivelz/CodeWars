package com.codewars.deni;

public class HighAndLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
		System.out.println(highAndLow(num));

	}
	
	 public static String highAndLow(String numbers) {
		    // Code here or
		    String[] numArr = numbers.split(" ");
		    String lowest = numArr[0];
		    String highest = numArr[0];  
		      for(String s: numArr) {
		       if(Integer.parseInt(s) <= Integer.parseInt(lowest)) lowest = s;
		       else if(Integer.parseInt(s) >= Integer.parseInt(highest)) highest = s;   
		      }  
		      String result = highest + " " + lowest;
		    return result;
		  }

}
