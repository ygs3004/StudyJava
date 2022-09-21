package tbraindatastructure;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
	int num;
	
	public SimpleNumber(int num) {
		this.num=num;
	}
	
	@Override
	public String toString() {
		return Integer.toString(num); //String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return this.num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof SimpleNumber)) {
			return false;
		}
		SimpleNumber snObj=(SimpleNumber)obj;
		if(snObj.num==this.num)
			return true;
		return false;
	}
	
}

public class SetExample05 {
	
	public static void main(String[] args) {
		
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("저장된 데이터 수 : "+hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}