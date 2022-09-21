package tbraindatastructure;

import java.util.HashMap;

class ContactInfo{
	String address;
	String phoneNo;
	ContactInfo(String address, String phoneNo){
		this.address=address;
		this.phoneNo=phoneNo;
	}
}

public class HashMapExample02 {

	public static void main(String[] args) {
		HashMap<String, ContactInfo> hashtable=new HashMap<String, ContactInfo>();
		hashtable.put("연흥부", new ContactInfo("강남","02-300-00000"));
		hashtable.put("연놀부", new ContactInfo("청담동","02-500-00000"));
		
		///
		ContactInfo obj=hashtable.get("홍길동");
		System.out.println("연놀부의 연락처");
		System.out.println("주소 : "+obj.address);
		System.out.println("전화번호 : "+obj.phoneNo);
	}

}