package tbraindatastructure;

import java.util.HashMap;

public class HashMapExample01 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("해리", new Integer(95)); // 원래 auto boxing 됨
		hashtable.put("헤르미온느", new Integer(100));
		hashtable.put("론", new Integer(85));
		hashtable.put("드레이코", new Integer(93));
		hashtable.put("네빌", new Integer(70));
		
		Integer num=hashtable.get("헤르미온느");
		System.out.println("헤르미온느 성적은 ? " + num);
	}

}