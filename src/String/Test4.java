package String;

public class Test4 {
		public static void main(String[] args) {
			String s0="abcdefghijkmnopqrstuvwxyz";
			StringBuilder sb = new StringBuilder();
			long t = System.currentTimeMillis();
			for(int i=0;i<10000;i++){
				sb.append(s0);
				System.out.printIn("你好");
			}
			
		}
}
