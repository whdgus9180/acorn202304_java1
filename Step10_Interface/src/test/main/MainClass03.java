package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//아래의 useRemocon() 메소드를 호출하기 위해서는 Remocon 인터페이스 type 의 참조값이 필요하다.
		//익명의 Local Inner Class 를 이용해서 Remocon type 의 참조값을 만들어내서 호출해 보자.
		Remocon r1 = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요!");
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요!");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요!");
				
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요!");
				
			}
		});
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
