package interfaceex;

public interface Calc {
<<<<<<< HEAD

	double PI = 3.14;
	int ERROR = -99999999;
=======
	
	double PI = 3.14;
	int ERROR = -999999999;
>>>>>>> 4abdbc8 (d)
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
<<<<<<< HEAD
	
	default void description() {
		System.out.println("점수 계산기를 구현합니다. ");
	}

	static int total(int[] arr) {
		int total = 0;
		for(int i: arr) {
			total += i;
		}
		return total;
	}
=======

	default void description(){
		System.out.println("���� ���⸦ �����մϴ�");
		myMethod();
	}
	
	static int total(int[] arr){
		
		int total = 0;
		
		for(int i: arr){
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private �޼��� �Դϴ�.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼��� �Դϴ�.");
	}
>>>>>>> 4abdbc8 (d)
}
