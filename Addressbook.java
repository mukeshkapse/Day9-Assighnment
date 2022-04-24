package Day9;

public class Addressbook {
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		int phoneNo;
		String email;

		Addressbook(String firstName, String lastName, String address, String city, String state, int zip, int phoneNo,
				String email) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phoneNo = phoneNo;
			this.email = email;
		}

		public void displayContact() {
			System.out.println("First name:"+this.firstName+"\nLast name:"+this.lastName+
					"\nAddress:"+this.address+"\nCity:"+this.city+"\nstate:"+this.state
					+"\nZip:"+this.zip+"\nPhone no:"+this.phoneNo+"\nemail:"+this.email);
			

		}
		public static void main(String[] args) {
			System.out.println("Welcome to Address Book Program");
			Addressbook contact = new Addressbook("mukesh","kapse","Mp","madhya pradesh","mp",460110,7067323,"mk@gmail.com");
			contact.displayContact();

		}

	}


