package co.kh.execsample.notice.serviceImpl;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;

import co.kh.execsample.common.DataSources;
import co.kh.execsample.notice.mapper.NoticeMapper;
import co.kh.execsample.notice.service.NoticeService;
import co.kh.execsample.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private SqlSession sqlSession = DataSources.getInstance().openSession(true);
	private NoticeMapper nm = sqlSession.getMapper(NoticeMapper.class);


	@Override
	public List<NoticeVO> noticeSelectList(String key, String val) {
		// TODO Auto-generated method stub
		return nm.noticeSearchList(key, val);
	}

	@Override
	public List<NoticeVO> noticeSearchList(String key, String val) {
		// TODO Auto-generated method stub
		return nm.noticeSearchList(key, val);
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		noticeUpdateHit(vo.getNoticeId());
		return nm.noticeSelect(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		// TODO Auto-generated method stub
		return nm.noticeDelete(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		// TODO Auto-generated method stub
		return nm.noticeUpdate(vo);
	}

	@Override
	public void noticeUpdateHit(int id) {
		// TODO Auto-generated method stub
		nm.noticeUpdateHit(id);
	}

	@Override
	public List<NoticeVO> noticeSelectList() {
		// TODO Auto-generated method stub
		return nm.noticeSelectList();
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		// TODO Auto-generated method stub
		return nm.noticeInsert(vo);
	}

}
