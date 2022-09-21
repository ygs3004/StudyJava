package wArrayExample_01;

public class ArrayEx_7 {

	public static void main(String[] args) {
		
		String str="The String class";
		char[] arr_ch=str.toCharArray();

		int UCNT=0;
		int LCNT=0;
				
		for(int i=0; i<arr_ch.length; i++) {
			if(Character.isLowerCase(arr_ch[i])){
				LCNT++;
			}else if(Character.isUpperCase(arr_ch[i])) {
				UCNT++;
			}
		}
		System.out.println("대문자의 개수는 : "+UCNT+" 소문자의 개수는 : "+LCNT);
	}	
}