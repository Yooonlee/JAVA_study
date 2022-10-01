package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		
>>>>>>> 4abdbc8 (d)
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	public void showInfo() {
		System.out.println("Calc ì¸í„°íŽ˜ì´ìŠ¤ë¥¼ êµ¬í˜„í•˜ì˜€ìŠµë‹ˆë‹¤ ");
=======
		if(num2 != 0 )
			return num1/num2;
		else 
			return Calc.ERROR;
	}
	
	public void showInfo(){
		System.out.println("Calc ÀÎÅÍÆäÀÌ½º¸¦ ±¸ÇöÇÏ¿´½À´Ï´Ù" );
>>>>>>> 4abdbc8 (d)
	}

	@Override
	public void description() {
<<<<<<< HEAD
		System.out.println("ì™„ë²½í•œ ê³„ì‚°ê¸°ìž…ë‹ˆë‹¤.");
	}
		
=======
		super.description();
	}
>>>>>>> 4abdbc8 (d)
}
