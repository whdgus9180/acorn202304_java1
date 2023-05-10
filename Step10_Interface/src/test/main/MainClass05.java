package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc add1 = new Calc() {
			
			@Override
			public double excute(double num1, double num2) {
				return num1+num2;	
			}
		
		};		
				
		Calc add2 = (num1, num2)->{
			return num1+num2;		
		};
		
	}
		Calc add = (num1, num2)->num1+num2;
		Calc sub = (num1, num2)->num1-num2;	
		Calc mul = (num1, num2)->num1/num2;	
	
		double result1 = add.excute(10, 20);
		double result2 = sub.excute(10, 20);
		double result3 = mul.excute(10, 20);
}
