package javaString;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Reverse
		String g = "Uploading a program files to the GIT";
		StringBuilder g1 = new StringBuilder(g);
		g1.reverse();
		System.out.println(g1);
		System.out.println(g);
		
		String g2 = "";
		for(int i=g.length()-1;i<=0;i--) {
			g2 += g.charAt(i);
		}
		System.out.println(g2);
		
		
		// String Split
		String [] g3 = g.split(" ");
		for (String g4 : g3) {
			System.out.println(g4);
		}
		System.out.println(" ");
		// String Arrays
		
		String g5 [] = {"Selenium","Java","Eclipse","Github","Upload"};
		System.out.println(g5[3]);
		
		// call all the arrays
		System.out.println(Arrays.toString(g5));
		
		// call last one
		System.out.println(g5[g5.length-1]);

	}

}
