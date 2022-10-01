package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student(10, "이순신");
		lee.address = "서울시 성북구 종암동";
		lee.studentInfo();
		
		Student kim = new Student();
		kim.studentName = "이경";
		kim.address = "순천시 ";
		kim.studentInfo();
		
		System.out.println(lee);
		System.out.println(kim);

	}

}
