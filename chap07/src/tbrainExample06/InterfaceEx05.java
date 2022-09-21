package tbrainExample06;

interface A2{
	void aaa();
	public abstract void bbb(); // default
}


class B2 implements A2{
	//void a(){
	public void aaa(){
		System.out.println("aaa메서드");	
	}
	
	
	public void bbb() {
	System.out.println("bbb메서드");	
	}
	
}

public interface InterfaceEx05 {
	
	public static void main(String[] args){
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();
	}
		

}
