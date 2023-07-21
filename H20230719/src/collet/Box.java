package collet;

public class Box<T> { // T = 값은 몰겠는데 들어오면 그걸로 바꾸줌
	T obj;
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}
