package collet.board;

import java.util.ArrayList;
import java.util.List;

public class BoardApp {
	// 게시글저장.
	List<Board> boards = new ArrayList<>();

	boolean addBoard(Board board) {

		return boards.add(board);
	}

	List<Board> boardList() {
		return null;
	}

	Board getBoard(int boardNo) {

		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
				return (boards.get(i));
			}
		}
		return null;
	}

	boolean delBoard(int boardNo) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
					boards.remove(i);
					return true;
			}
		}

		return false;
	}

	private boolean boards(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
