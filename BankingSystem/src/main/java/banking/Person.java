package banking;

public class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		this.firstName=firstName;
		this.lastName=lastName;
		AccountHolder acHold = new AccountHolder(idNumber);
	}

	public String getFirstName() {
		// complete the function
        return firstName;
	}

	public String getLastName() {
		// complete the function
        return lastName;
	}
}
