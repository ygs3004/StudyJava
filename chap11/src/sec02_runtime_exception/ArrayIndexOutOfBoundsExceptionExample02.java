package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample02 {

	public static void main(String[] args) {
		if(args.length==4) {
			String data1=args[0];
			String data2=args[1];
			String data3=args[2];
			String data4=args[3];
			System.out.println("args[0] : "+data1);
			System.out.println("args[1] : "+data2);
			System.out.println("args[2] : "+data3);
			System.out.println("args[3] : "+data4);
		}else {
			System.out.println("[실행 방법]");
			System.out.println("Java ArrayIndexOutOfBound");
			System.out.println("값1 값2");
			/* data는 if가 true일때만 생성되는 변수 else 안에서 쓸 수 없다.
			System.out.println("args[0] : "+data1);
			System.out.println("args[1] : "+data2);
			System.out.println("args[2] : "+data3);
			System.out.println("args[3] : "+data4);
			*/
		}
	}

}