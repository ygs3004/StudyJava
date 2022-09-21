package tbraindatastructure;

import java.util.HashMap;

class Name{

	String firstName;
	String lastName;
	
	Name(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public int hashCode() {
		return firstName.hashCode()+lastName.hashCode();
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Name)) {
			return false;
		}
		Name name=(Name)obj;
		if(this.firstName.equals(name.firstName) && this.lastName.equals(name.lastName))
			return true;
			return false;
	}
}

public class HashMapExample05 {

	public static void main(String[] args) {
		HashMap<Name, Integer> hashtable=new HashMap<Name,Integer>();
		
		hashtable.put(new Name("해리","포터"), new Integer(95));
		hashtable.put(new Name("헤르미온느","그레인져"), new Integer(100));
		hashtable.put(new Name("론","위즐리"), new Integer(85));
		hashtable.put(new Name("드레이코","말포이"), new Integer(93));
		hashtable.put(new Name("네빌","롱바텀"), new Integer(70));
		
		Integer num1=hashtable.get(new Name("헤르미온느","그레인져"));
		System.out.println("헤르미온느 그레인져의 성적은?"+num1);
		(new Name("헤르미온느","그레인져")).hashCode();
	}

}
