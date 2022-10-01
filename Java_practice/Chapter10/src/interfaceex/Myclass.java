package interfaceex;

public class Myclass implements  MyInterFace{

	@Override
	public void y() {
		System.out.println("x()");
	}

	@Override
	public void x() {
		System.out.println("y()");
		
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
		
	}
	
	public static void main(String[] args) {
		Myclass myClass = new Myclass();
		
		X xClass = myClass;
		xClass.x();
	}
}
