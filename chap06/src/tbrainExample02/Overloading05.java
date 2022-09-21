package tbrainExample02;

class Person {
	private int perID;
	private int milID;

	// 생성자도 overloading이 적용 된다.
	Person(int perID) {
		this(perID, 0);
	}

	Person(int perID, int milID) {
		this.perID = perID;
		this.milID = milID;
	}

	void showInfo() {
		System.out.println("민번 : " + perID);
		if (milID == 0) {
			System.out.println("군과 관계 없음\n");
		} else {
			System.out.println("군번 : " + milID + "\n");
		}
	}
}

public class Overloading05 {

	public static void main(String[] args) {
		Person man = new Person(950123, 880102);
		Person woman = new Person(941125);
		man.showInfo();
		// 민번 : 950123
		// 군번 : 880102 출력하시오
		woman.showInfo();
		// 민번 : 941125
		// 군과 관계 없음
	}
}