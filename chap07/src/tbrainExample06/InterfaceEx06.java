package tbrainExample06;

interface A3{
	
	int x=100; // public static final
	
	//정적 중첩 클래스
	class B3{ //public static
		private int y;
		
		public B3() {
			this.y=200;
		}
		
		public void dips() {
			System.out.println("x="+x);
			System.out.println("y="+y);
		}
		
	}
}

public class InterfaceEx06 {

}
