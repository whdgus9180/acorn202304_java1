package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class Mainclass01 {
	public static void main(String[] args) {
		// 어떻게 하면 Remocon 인터페이스 type 의 참조값을 얻어낼수 있을까?
		Remocon r1 = new MyRemocon();
		r1.up();
		r1.down();
	}
}
