package String;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("email:");
		String e = new Scanner(System.in).nextLine();
		String n = getName(e);
		System.out.println(n);
		}

	private static String getName(String e) {
		int i = e.indexOf("@");//从零开始计数
		if(i==-1){
			return "错误格式";
		}
		System.out.println(i);
		//截取[0,i)左闭右开
		return e.substring(0,i);
	}
}
