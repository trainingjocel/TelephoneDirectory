
public class Contact {

	private String name;
	private String phoneNumber;
	
	
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	@Override
	public String toString() {
		return "name=" + name + ", phoneNumber=" + phoneNumber + "\n";
	}


	public static Contact createContact(String name,String phoneNumber) {
		return new Contact(name, phoneNumber);
	}
	
}
