package test3;

public class test3 {
	public static void main(String[] args) {
		
		Score[] score = new Score[4];
		score[0] = new Score("홍길동", 60, 75);
		score[1] = new Score("강호동", 70, 80);
		score[2] = new Score("유재석", 80, 90);
		score[3] = new Score("박명수", 55, 100);
		
		for(int i=0; i<score.length-1; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i].sum<score[j].sum) {
					Score temp = score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
			score[i].ranking = i+1;
		}
		score[score.length-1].ranking = score.length;
		
		
		for(int i=0; i<score.length-1; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i].name.compareTo(score[j].name)>0) {
					Score temp = score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
			System.out.println(score[i].toString());
		}
		System.out.println(score[score.length-1]);
		
	}
}


class Score{
	
	String name;
	int kor;
	int eng;
	int ranking;
	int sum;
	
	Score(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.sum=kor+eng;
	}
	
	@Override
	public String toString() {
		return
				"이름 : "+name+", 총점 : "+(kor+eng)+", 순위 : "+ranking;
	}
}