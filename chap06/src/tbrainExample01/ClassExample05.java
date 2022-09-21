package tbrainExample01;

public class ClassExample05 {

	int width;
	int height;
	int depth;
	
	public ClassExample05(int w, int h, int d) {
		width=w;
		height=h;
		depth=d;
	}
	
	public static void main(String[] args) {
		ClassExample05 mtest=new ClassExample05(10, 20, 30);
		int vol=mtest.width*mtest.height*mtest.depth;
		System.out.println("박스의 부피 : "+vol);
	}
}