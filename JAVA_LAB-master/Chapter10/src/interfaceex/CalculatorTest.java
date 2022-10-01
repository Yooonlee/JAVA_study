package interfaceex;

public class CalculatorTest {
<<<<<<< HEAD
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();
		CompleteCalc calc1 = new CompleteCalc();
		Calculator calc2 = new CompleteCalc();
//		Calc calc1 = new Calc(); ë¶ˆê°€ëŠ¥ 
//		Calc calc2 = new Calculator(); ë¶ˆê°€ëŠ¥ 
 		calc.add(num1, num2);
 		
 		calc.description();
 		
 		int[] arr = {1,2,3,4,5};
 		int sum = Calc.total(arr);
 		System.out.println(sum);
=======

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		Calc newCalc = calc;
		
		calc.description();   //µðÆúÆ® ¸Þ¼Òµå È£Ãâ
				
	    int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));  //Á¤Àû ¸Þ¼Òµå »ç¿ëÇÏ±â

>>>>>>> 4abdbc8 (d)
	}
}
