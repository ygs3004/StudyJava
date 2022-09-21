package tbrainExample01;

public class StringEx01 {

	public static void main(String[] args) {
		String str="자바 커피";
		int len=str.length();
		
		for(int cnt=0; cnt<len; cnt++) {
			System.out.println(str.charAt(cnt));
		}
	}

}