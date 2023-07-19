package co.yedam.friend;

public class Company extends Friend {
	private String company; // 회사
	private String dept; // 부서

	// 생성자
	public Company(String name, String phone, String company, String dept) {
		super(name, phone); // 부모
		this.company = company;
		this.dept = dept;
	}

	// 메소드
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return dept;
	}

	public void setDepartment(String department) {
		this.dept = department;
	}

	// showInfo()
	@Override // 부모꺼 가져올래 ( 수정하면 내꺼 )
	public String showInfo() {
		return " 이름: " + getName() + " 번호: " + getPhone() + " 회사: " + company + " 부서: " + dept;
	}
}
