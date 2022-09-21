package tbrainExample05;

class Father{
	public void play() {
		System.out.println("father:swimming");
	}
	
	public void study() {
		System.out.println("father:Java Programming");
	}
}

class Johnharu extends Father{
	
	@Override
	public void study() {
		System.out.println("johnharu:C# Programming");
	}
}

class Gracedew extends Father{
	
	@Override
	public void play() {
		System.out.println("gracedew:BaseBall");
	}
}

class Moon extends Father{
	
	@Override
	public void play() {
		System.out.println("moon:basketBall");
	}
	
	@Override
	public void study() {
		System.out.println("moon:Visual Basic,Visual C++");
	}
}

public class Family01 {

	public static void main(String[] args) {
		
		Father daddy=new Father();
		daddy.play();
		daddy.study();
		
		daddy=new Johnharu(); // 계속 타입은 father 
		daddy.play();
		daddy.study();		
		
		daddy=new Gracedew();
		daddy.play();
		daddy.study();
		
		daddy=new Moon();
		daddy.play();
		daddy.study();
		
		
		
		
		
		
	}

}