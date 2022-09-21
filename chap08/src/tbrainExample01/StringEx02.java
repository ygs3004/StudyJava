package tbrainExample01;

public class StringEx02 {

	public static void main(String[] args) {
		//String str1="자바";
		//String str2="자바";
		
		String str1=new String("자바");
		String str2=new String("자바");
		
		if(str1 == str2) {
			System.out.println("같음"+str1.hashCode());
			System.out.println("같음"+str2.hashCode());
		}
		else {
			System.out.println(System.identityHashCode(str2));
			System.out.println(System.identityHashCode(str1));
		}
	}
}