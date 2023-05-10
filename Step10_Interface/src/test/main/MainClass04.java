package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {			
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요");			
			}
		});
		
		//위에꺼 간략한 표션식(줄인표현) 추상메소드가 오직 1개인 인터페이스에 한해서!
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫어요!");
		});
		
	}
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
