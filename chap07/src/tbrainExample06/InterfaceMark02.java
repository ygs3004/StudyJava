package tbrainExample06;

interface UpperCasePrintable{
	
}

class ClassPrinter{
	
	public static void print(Object obj) {
		String org=obj.toString();
		if(obj instanceof UpperCasePrintable) {
			org=org.toUpperCase();	// 대문자로 
		}
		System.out.println(org);
	}
	
}

class PointOne implements UpperCasePrintable{
	private int xPos,yPos;
	
	PointOne(int x, int y){
		xPos=x;
		yPos=y;
	}
	
	@Override
	public String toString() {  								//Object 클래스에 정의되어있는 메소드 toString은 public,   
		String posInfo="[x pos:"+xPos+", y pos:"+yPos+"]";		//따라서 반드시 public으로 오버라이드
		return posInfo;
	}
}

class PointTwo{
	private int xPos,yPos;
	
	PointTwo(int x, int y){
		xPos=x;
		xPos=y;
	}
	
	@Override
	public String toString() {  								   
		String posInfo="[x pos:"+xPos+", y pos:"+yPos+"]";		
		return posInfo;
	}
}

public class InterfaceMark02 {

	public static void main(String[] args) {
		PointOne pos1=new PointOne(1,1);
		PointTwo pos2=new PointTwo(2,2);
		PointOne pos3=new PointOne(3,3);
		PointTwo pos4=new PointTwo(4,4);
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
	}
	
}