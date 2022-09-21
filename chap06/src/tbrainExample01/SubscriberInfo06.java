package tbrainExample01;

public class SubscriberInfo06 {
	String name;
	String id;
	String password;
	String phoneNo;
	String address;

	public SubscriberInfo06(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public SubscriberInfo06(String name, String id, String password, String phoneNo, String address) {
		this(name, id, password);
		//this.name = name;
		//this.id = id;
		//this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int setAddress(String address) {
		this.address = address;
		return 0;
	}
	
}