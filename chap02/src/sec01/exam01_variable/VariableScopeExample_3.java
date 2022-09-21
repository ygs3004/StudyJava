package sec01.exam01_variable;

public class VariableScopeExample_3 {

	public static void main(String[] args) {
		int var1; // 중요 : 변수가 선언된 위치가 어디?
		
		if(true) {
			int var2;
			/// int var3; 아래 구역과 같은 변수 이름이지만 다른 구역
			var1=10;
			var2=20;
		}
		var1=20;
		// var2=30; 변수 선언 범위 밖
		for(int i=0;i<1;i++) {
			int var3;
			var1=10;
			var3=30;
		}
		var1=20;
		// var3=40; 변수 선언 범위 밖
	}

}