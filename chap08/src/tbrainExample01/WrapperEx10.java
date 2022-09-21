package tbrainExample01;

public class WrapperEx10 {

	public static void main(String[] args) {
		Integer iValue=new Integer(10);
		Double dValue=new Double(3.14);
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		iValue=new Integer(iValue.intValue()+10);
		dValue=new Double(dValue.doubleValue()+1.2);
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		Integer obj=new Integer(10);
		int sum=obj +20; //auto unboxing 
		
		System.out.println(sum);
	}
	
}	