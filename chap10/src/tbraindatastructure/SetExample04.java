package tbraindatastructure;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;

	}
	
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode()+this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person newPerson = (Person)obj;
			if((this.name.equals(newPerson.name)) && (this.age==newPerson.age)) {
				return true;
			} 
			return false;
	}
	
}

public class SetExample04 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 23));
		set.add(new Person("홍길동", 23)); // 같은 값은 저장 되지 않음, 해당 경우 다른객체로 인식
		System.out.println(set);
	}	

}