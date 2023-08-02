package co.micol.privateproject.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import co.micol.privateproject.common.DataSource;
import co.micol.privateproject.member.service.MemberService;
import co.micol.privateproject.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	Scanner scn = new Scanner(System.in);
	private DataSource dao = DataSource.getInstance();
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	private void close() {
		try {
			if (resultSet != null)
				resultSet.close();
			if (preparedStatement != null)
				preparedStatement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override // 로그인 기능
	public boolean memberLogin(MemberVO vo) {
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID =? AND MEMBER_PASSWORD=?";
		try {
			connection = dao.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, vo.getMemberId());
			preparedStatement.setString(2, vo.getMemberPassword());
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return false;
	}

	@Override // 회원가입 기능
	public int memberSignUp(MemberVO vo) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?)";
		connection = dao.getConnection();
		int n = 0;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, vo.getMemberId());
			preparedStatement.setString(2, vo.getMemberPassword());
			preparedStatement.setString(3, vo.getMemberName());
			preparedStatement.setInt(4, vo.getMemberAge());
			preparedStatement.setString(5, vo.getMemberGender());
			preparedStatement.setString(6, vo.getMemberTel());
			preparedStatement.setString(7, vo.getMemberAddress());
			n = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override // 회원탈퇴 기능
	public int memberDelete(MemberVO vo) {
		String sql = "DELETE FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PASSWORD = ?";
		int n = 0;
		
		try {
			connection = dao.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, vo.getMemberId());
			preparedStatement.setString(2, vo.getMemberPassword());
			n = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
}