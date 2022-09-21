package sec03_try_catch_finally;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("java.lang.String");
			System.out.println("clazz : "+clazz);
			
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}