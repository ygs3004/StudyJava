package tbraindatastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetExample03 {

	// 순서를 유지하지 않는다.
	// 중복되는 객체는 저장하지 않는다.
	public static void main(String[] args) {
		Object[] objArr= {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set<Object> set = new HashSet<Object>();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
	
}