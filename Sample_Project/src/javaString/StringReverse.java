package javaString;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	}

}
