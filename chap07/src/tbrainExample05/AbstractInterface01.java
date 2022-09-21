package tbrainExample05;

// abstract class PersonalNumberStorage{
interface PersonalNumberStorage{
	public abstract void addPersonalInfo(String name, String perNum);
	public abstract String searchName(String perNum);
}

class PersonalNumInfo{
	private String name;
	private String number;
	
	PersonalNumInfo(String name, String number){
		this.name=name;
		this.number=number;
	}
	
	String getName() {
		return this.name;
	}
	
	String getNumber() {
		return this.number;
	}
}

// class PersonalNumberStorageImp1 extends PersonalNumberStorage{
class PersonalNumberStorageImp1 implements PersonalNumberStorage{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	int i=0;
	
	PersonalNumberStorageImp1(int sz){
		numOfPerInfo=0;
		perArr=new PersonalNumInfo[sz];
	}
	
	@Override
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;
	}
	
	@Override
	public String searchName(String perNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0) {// ==, equals
				return perArr[i].getName();
			} 
		}return "찾을 수 없습니다.";
	}
	
}		
		
		/*
		for(int i=0; i<perArr.length; i++) {
			if(perArr[i]==null)
				break;
			if(perArr[i].getNumber==perNum)
				return perArr[i].getName();
		} return "찾을 수 없습니다.";
		*/


public class AbstractInterface01 {

	public static void main(String[] args) {
		PersonalNumberStorage storage=new PersonalNumberStorageImp1(100);
		storage.addPersonalInfo("김기둥", "950000-1122333");
		storage.addPersonalInfo("장산길", "970000-1122334");
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));
	}

}
