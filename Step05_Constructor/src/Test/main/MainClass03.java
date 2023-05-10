package Test.main;

import Test.mypac.Cpu;
import Test.mypac.HardDisk;
import Test.mypac.MacBook;
import Test.mypac.Memory;

public class MainClass03 {
	/*
	 * MacBook 객체를 생성해서 찹조값을 book 이라는 지역 변수에 담아보세요.
	 * 
	 * 주의!
	 * - MacBook 클래스는 절대 수정하지 마세요
	 * - MainClass03 은 test.main 패키지에 있고
	 *   Cpu, Memory, HardDisk, MacBook 클래스는 test.mypac 패키지에 있기 때문에
	 *   4개의 클래스 모두 import 되어야 한다.
	 */
	public static void main(String[] args) {
		
		MacBook book= new MacBook(new Cpu(),new Memory(),new HardDisk());
		
		MacBook book2 = new MacBook(null,null,null);
		
		book.doGame();
		book2.doGame();
		
		Cpu c = new Cpu();
		Memory m = new Memory();
		HardDisk h = new HardDisk();
		//생성자의 인자로 전달할 값이 지역변수에 있는경우 지역변수를 참조해서 전달할수도 있다.
		MacBook book3=new MacBook(c,m,h);
		
		book3.doGame();
	
	}
}
