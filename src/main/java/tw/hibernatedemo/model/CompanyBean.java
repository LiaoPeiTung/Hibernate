package tw.hibernatedemo.model;

public class CompanyBean {

	private int companyId;
	
	private String companyName;
	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CompanyBean() {
	}

	public CompanyBean(int companyId, String companyName ) {
		this.companyId = companyId;
		this.companyName = companyName;
	
	}
	
}
