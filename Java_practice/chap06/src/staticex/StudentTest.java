package staticex;

public class StudentTest {
	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		
		Student studentL = new Student();
		System.out.println(studentL.studentID);

		System.out.println(Student.getSerialNum());
	//	System.out.println(studentJ.serialNum); //private 이라 안됨
		System.out.println(studentJ.getSerialNum()); //private 이라 안됨

		
	}
}
