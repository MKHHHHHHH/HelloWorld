package co.micol.privateproject.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelectList(); // 전체조회

	BoardVO boardSelect(BoardVO vo); // 하나조회

	int boardInsert(BoardVO vo); // 등록

	int boardDelete(BoardVO vo); // 삭제

	int boardUdpdate(BoardVO vo); // 수정

	int hitCount(BoardVO vo); // 조회수 증가 기능

	int boardNum(); // 글번호 자동지정

}