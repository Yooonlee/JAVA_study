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
		System.out.println("ì ìˆ˜ ê³„ì‚°ê¸°ë¥¼ êµ¬í˜„í•©ë‹ˆë‹¤. ");
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
		System.out.println("Á¤¼ö °è»ê±â¸¦ ±¸ÇöÇÕ´Ï´Ù");
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
		System.out.println("private ¸Ş¼­µå ÀÔ´Ï´Ù.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static ¸Ş¼­µå ÀÔ´Ï´Ù.");
	}
>>>>>>> 4abdbc8 (d)
}
