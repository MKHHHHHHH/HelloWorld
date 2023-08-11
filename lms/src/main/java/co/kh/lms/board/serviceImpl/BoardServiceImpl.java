package co.kh.lms.board.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.kh.lms.board.service.BoardService;
import co.kh.lms.board.service.BoardVO;
import co.kh.lms.common.DataSource;
import co.kh.lms.member.map.MemberMapper;

public class BoardServiceImpl implements BoardService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	MemberMapper map = sqlSession.getMapper(MemberMapper.class);

	@Override
	public List<BoardVO> BoardSelectList() {
		return BoardSelectList();
	}
}
