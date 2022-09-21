package tbrainExample01;

public class StringEx04 {

	public static void main(String[] argd) {
		String str1=" let it be. ";
		String str2 =str1.trim();
		
		// 문자열의 앞뒤 공백을 제거
		System.out.println(str2);
		//문자열 뒤에 연결
		System.out.println(str2.concat("Speaking words of wisdom"));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e','a'));
		System.out.println(str2);
		System.out.println();
				
	}
}