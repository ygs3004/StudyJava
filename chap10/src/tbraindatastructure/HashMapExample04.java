package tbraindatastructure;

public class HashMapExample04 {

	public static void main(String[] args) {
		String obj1 = new String("헤르미온느");
		String obj2 = new String("헤르미온느");
		
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();
		
		System.out.println(obj1);
		System.out.println(obj2.toString());
		System.out.println(hash1);
		System.out.println(hash2);
	}
	
}