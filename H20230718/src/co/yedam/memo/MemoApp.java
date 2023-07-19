package co.yedam.memo;

public class MemoApp {
	Memo[] memo;
	int memoNum = 0;

	MemoApp() {
		memo = new Memo[10];
	}

	void addMemo(Memo mamo) {
		memo[memoNum] = mamo;
		memoNum++;
	}

	void editMemo(int number, String neyo) {
		for (int i = 0; i < memoNum; i++) {

		}
	}

	void delMemo(int number) {
		for (int i = 0; i < memoNum; i++) {

		}
	}

	void findMemo(int number) {

	}
}
