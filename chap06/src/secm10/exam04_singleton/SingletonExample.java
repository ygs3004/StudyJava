package secm10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
	//	Singleton obj1=new Singleton();
	//	Singleton obj2=new Singleton();  private 생성자일경우 외부에서 객체 생성 불가.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}
}