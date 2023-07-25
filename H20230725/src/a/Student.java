package a;

import java.io.Serializable;

public class Student implements Serializable {
	private int num;
	private String name;
	private int kr;
	private int eng;
	private int math;

	@Override
	public String toString() {
		return "학번 = " + num + ", 이름 = " + name + ", 국어 = " + kr + ", 영어 = " + eng + ", 수학 = " + math;
	}

	public Student(int num, String name, int kr, int eng, int math) {
		super();
		this.num = num;
		this.name = name;
		this.kr = kr;
		this.eng = eng;
		this.math = math;
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKr() {
		return kr;
	}

	public void setKr(int kr) {
		this.kr = kr;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}
