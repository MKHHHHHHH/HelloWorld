package co.micol.privateproject.member.service;

import java.util.List;

public interface MemberService {
	public boolean memberLogin(MemberVO vo); // 로그인 기능

	public int memberSignUp(MemberVO vo); // 회원가입 기능

	public int memberDelete(MemberVO vo); // 회원탈퇴 기능
}
