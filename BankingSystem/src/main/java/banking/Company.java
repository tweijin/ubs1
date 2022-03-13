package banking;

public class Company  {
	private String companyName;

	public Company(String companyName, int taxId) {
		// complete the function
		this.companyName=companyName;
		AccountHolder acHol = new AccountHolder(taxId);
	}

	public String getCompanyName() {
		// complete the function
        return companyName;
	}
}
