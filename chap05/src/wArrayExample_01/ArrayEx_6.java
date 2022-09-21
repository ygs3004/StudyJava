package wArrayExample_01;

//문자를 배열에 저장하는 메소드, 저장되었는지 확인
public class ArrayEx_6 {

	public static void main(String[] args) {
		
		String str="The String class";
		char[] arr_ch=str.toCharArray();

		for(int i=0;i<arr_ch.length;i++) {
			System.out.print(arr_ch[i]);
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<arr_ch.length;i++) {
		System.out.printf("%c %d번 \n",arr_ch[i], i);
		}
		
		System.out.println("문자의 길이 :"+arr_ch.length);
		System.out.println("========================");
		System.out.println("10번째 문자 : "+arr_ch[9]);
	}

}
