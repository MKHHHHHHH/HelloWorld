package co.micol.privateproject.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.micol.privateproject.board.service.BoardService;
import co.micol.privateproject.board.service.BoardVO;
import co.micol.privateproject.common.DataSource;

public class BoardServiceImpl implements BoardService {
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

	@Override // 조회수 증가
	public int hitCount(BoardVO vo) {
		String sql = "UPDATE BOARD SET BOARD_HIT = BOARD_HIT + 1 WHERE BOARD_ID = ?";
		int n = 0;
		try {
			connection = dao.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, vo.getBoardId());
			n = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override // 글번호 자동 부여
	public int boardNum() {
		String sql = "SELECT MAX(BOARD_ID) FROM BOARD";
		connection = dao.getConnection();
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			int num = 0;
			if (resultSet.next()) {
				return num = resultSet.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 1;
	}

	@Override // 게시판 등록
	public int boardInsert(BoardVO vo) {
		String sql = "INSERT INTO BOARD (BOARD_ID, BOARD_WRITER , BOARD_TITLE, BOARD_SUBJECT) VALUES (?,?,?,?)";
		int n = 0;
		try {
			connection = dao.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, vo.getBoardId());
			preparedStatement.setString(2, vo.getBoardWriter());
			preparedStatement.setString(3, vo.getBoardTitle());
			preparedStatement.setString(4, vo.getBoardSubject());
			n = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override // 게시판 수정
	public int boardUdpdate(BoardVO vo) {
		String sql = "UPDATE BOARD SET BOARD_SUBJECT = ? WHERE BOARD_ID = ?";
		int n = 0;
		try {
			connection = dao.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, vo.getBoardSubject());
			preparedStatement.setInt(2, vo.getBoardId());
			n = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override // 게시판 삭제
	public int boardDelete(BoardVO vo) {
		String sql = "DELETE FROM BOARD WHERE BOARD_ID = ?";
		int n = 0;
		try {
			connection = dao.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, vo.getBoardId());
			n = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override // 게시판 하나 출력
	public BoardVO boardSelect(BoardVO vo) {
		String sql = "SELECT * FROM BOARD WHERE BOARD_ID = ?";
		try {
			connection = dao.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, vo.getBoardId());
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				vo.setBoardId(resultSet.getInt("board_id"));
				vo.setBoardWriter(resultSet.getString("board_writer"));
				vo.setBoardTitle(resultSet.getString("board_title"));
				vo.setBoardSubject(resultSet.getString("board_subject"));
				vo.setBoardDate(resultSet.getDate("board_date"));
				vo.setBoardHit(resultSet.getInt("board_hit"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	@Override // 게시판 전체 목록출력
	public List<BoardVO> boardSelectList() {
		String sql = "SELECT * FROM BOARD ORDER BY BOARD_ID";
		List<BoardVO> boards = new ArrayList<BoardVO>();
		BoardVO vo;
		connection = dao.getConnection();
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				vo = new BoardVO();
				vo.setBoardId(resultSet.getInt("board_id"));
				vo.setBoardWriter(resultSet.getString("board_writer"));
				vo.setBoardTitle(resultSet.getString("board_title"));
				vo.setBoardSubject(resultSet.getString("board_subject"));
				vo.setBoardDate(resultSet.getDate("board_date"));
				vo.setBoardHit(resultSet.getInt("board_hit"));
				boards.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return boards;
	}

}