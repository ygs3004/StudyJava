package sec04.exam02_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1="JDK  "+6.0;// String 문자열에 관련된 클래스
		String str2=str1+"특징";
		System.out.println(str1);
		System.out.println(str2);
				
		String str3="JDK"+3+3.0;
		//String str3="JDK"+(3+3.0);
		String str4=3+3.0+"JDK";
		System.out.println(str3);
		System.out.println(str4);
		
	}
	
}