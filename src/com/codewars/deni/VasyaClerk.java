package com.codewars.deni;

public class VasyaClerk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String Tickets(int[] peopleInLine) {
		int d25 = 0;
		int d50 = 0;
		String result = "";

		for (int i = 0; i < peopleInLine.length; i++) {
			if (peopleInLine[i] == 25)
				d25++;

			if (peopleInLine[i] == 50) {
				d25--;
				d50++;
			}

			if (peopleInLine[i] == 100) {
				if (d50 >= 1) {
					d50--;
					d25--;
				} else
					d25 -= 3;
			}
			if (d25 < 0)
				return "NO";

		} // end of loop
		return "YES";
	}

}
