package String;

public class Test1 {
	public static void main(String[] args) {
		char[] a={'a','b','c','d'};
		String s= new String(a);

		
		String s2="abcd";
		String s3="abcd";


		System.out.println(s2 == s);
		System.out.println(s2==s3);
		System.out.println(s.equals(s2));

 	}
}
