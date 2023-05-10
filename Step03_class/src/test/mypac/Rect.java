package test.mypac;

public class Rect {
	public int width;
	public int height;
	
	public void printArea() {
		int printArea=this.width*this.height;
		System.out.println("사각형의 넓이는 "+this.width*this.height+" 입니다.");
	}
}
