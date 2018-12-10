package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("输入：");
		int[] a={1,2,3,4,5,6};
		char[] r={'a','b','c','d','e','f'};
		System.out.println(r.toString());//数组的toString是内存地址
		String k="abcdef";
		Integer d=5;
		
		int parseInt = Integer.parseInt("89454");
		char charAt = k.charAt(1);
		System.out.println("charAt"+charAt);
		int sum=parseInt+1;
		System.out.println("sum="+sum);
		System.out.println(r.length);
		System.out.println(k.toString());//字符串的toString打印字符串
		List list= new ArrayList();
		Map map=new HashMap();
		map.put("list",1111);
		map.put("len", "len");
		list.add("wo");
		list.add(111);
		list.add(map); 
		
		System.out.println(list.size());//集合是size(),数组是length,
		System.out.println(list.toString());//集合的toString()是打印字符串

		
		System.out.println(a.length);
		System.out.println(r.length);
		String s = new Scanner(System.in).nextLine();
		if (huiWen(s)) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
	}

	private static boolean huiWen(String s) {
		System.out.println();
		System.out.println(s.length());
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		return true;
	}
}
