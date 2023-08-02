package co.micol.privateproject.member.service;

import lombok.Data;

@Data
public class MemberVO {
	private int memberId;
	private String memberPassword;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String memberTel;
	private String memberAddress;

	public String toString() {
		System.out.print(memberId + " ");
		System.out.print(memberPassword + " ");
		System.out.print(memberName + " ");
		System.out.print(memberAge + " ");
		System.out.print(memberGender + " ");
		System.out.print(memberTel + " ");
		System.out.println(memberAddress + " ");
		return null;
	}
}
