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
		System.out.println("Calc 인터페이스를 구현하였습니다 ");
=======
		if(num2 != 0 )
			return num1/num2;
		else 
			return Calc.ERROR;
	}
	
	public void showInfo(){
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�" );
>>>>>>> 4abdbc8 (d)
	}

	@Override
	public void description() {
<<<<<<< HEAD
		System.out.println("완벽한 계산기입니다.");
	}
		
=======
		super.description();
	}
>>>>>>> 4abdbc8 (d)
}
