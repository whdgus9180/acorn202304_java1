package test.main;

import test.mypac.Rect;

/*
 *  tset.mypac 패키지에 클래스를 하나 만들어보세요
 *  
 *  - 사각형의 폭(width), 높이(height) 를 필드에 저장할수 있어야 합니다.
 *  - 필드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 기능을 가지고 있어야 합니다.
 *  - 필드와 메소드는 모두 non static 으로 만드세요
 *  - 클래스명, 필드명, 메소드명은 여러분이 마음대로 정해보세요.
 */
public class MainClass10 {
	public static void main(String[] args) {
		Rect r1=new Rect();
		r1.width=100;
		r1.height=200;
		r1.printArea();
		
		Rect r2=new Rect();
		r2.width=30;
		r2.height=5;
		r2.printArea();
	}
}
