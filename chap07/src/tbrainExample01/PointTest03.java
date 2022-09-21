package tbrainExample01;

class Point2 {
	int x = 10;
	int y = 20;

	Point2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

class Point4D extends Point2 {
	int z = 30;

	Point4D(){
		this(100,200,300);
	}
	
	Point4D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

}

public class PointTest03 {

	public static void main(String[] args) {
		Point4D p3 = new Point4D();
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
	}

}