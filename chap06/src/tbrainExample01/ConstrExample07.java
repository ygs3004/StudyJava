package tbrainExample01;

public class ConstrExample07 {

	public static void main(String[] args) {

		SubscriberInfo06 obj1 = new SubscriberInfo06("연흥부", "poorman", "zebi");
		SubscriberInfo06 obj2 = new SubscriberInfo06("연놀부", "richman", "money", "02-0000-0000", "타워팰리스");
		
		/*
		 * System.out.println("이름 : " + obj1.name);
		 * System.out.println("아이디 : " + obj1.id);
		 * System.out.println("비밀번호 : " + obj1.password);
		 * System.out.println("전화번호 : " + obj1.phoneNo);
		 * System.out.println("주소 : " + obj1.address);
		 * System.out.println("========================");
		 * System.out.println("이름 : " + obj2.name);
		 * System.out.println("아이디 : " + obj2.id);
		 * System.out.println("비밀번호 : " + obj2.password);
		 * System.out.println("전화번호 : " + obj2.phoneNo);
		 * System.out.println("주소 : " + obj2.address);
		 */
		printSubscriberInfo06(obj1);
		printSubscriberInfo06(obj2);

	}

	public static void printSubscriberInfo06(SubscriberInfo06 obj) {
		 System.out.println("이름 : " + obj.name);
		 System.out.println("아이디 : " + obj.id);
		 System.out.println("비밀번호 : " + obj.password);
		 System.out.println("전화번호 : " + obj.phoneNo);
		 System.out.println("주소 : " + obj.address);
		 System.out.println("========================");
	}
}