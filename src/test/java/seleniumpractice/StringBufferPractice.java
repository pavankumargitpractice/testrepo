package seleniumpractice;

public class StringBufferPractice {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Hello");
		//sb.append("World");
		//System.out.println(sb);
		
		System.out.println(sb.insert(1, "world"));

	}

}
