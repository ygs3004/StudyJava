package tbraindatastructure;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample01 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		
		System.out.println("저장된 데이터의 수 ="+set.size());
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}
	}
}