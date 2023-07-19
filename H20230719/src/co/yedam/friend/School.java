package co.yedam.friend;

public class School extends Friend {
	
	//필드
	private String school;
	private String major;
	
	//생성자
	public School(String name, String phone, String school, String major) {
		super(name, phone); // 부모
		this.school = school;
		this.major = major;
	}
	
	// get set
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String showInfo() {
		return "이름: " + getName() + " 번호: " + getPhone() + " 학교: " + school + " 전공: " + major;
	}
	
}
