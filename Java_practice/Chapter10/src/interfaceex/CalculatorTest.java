package interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();
		CompleteCalc calc1 = new CompleteCalc();
		Calculator calc2 = new CompleteCalc();
//		Calc calc1 = new Calc(); 불가능 
//		Calc calc2 = new Calculator(); 불가능 
 		calc.add(num1, num2);
 		
 		calc.description();
 		
 		int[] arr = {1,2,3,4,5};
 		int sum = Calc.total(arr);
 		System.out.println(sum);
	}
}
