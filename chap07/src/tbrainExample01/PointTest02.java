package tbrainExample01;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void getLocation() {
		System.out.println("x:" + x + ", y:" + y);
	}

}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	void getLocation() {
		System.out.println("x:" + x + ", y:" + y+", z:"+z);
	}
}

public class PointTest02 {

	public static void main(String[] args) {

		Point3D d3=new Point3D(1,2,3);
		d3.getLocation();
		
		
	}
}