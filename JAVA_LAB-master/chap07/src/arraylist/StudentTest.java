package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 80);
		studentLee.addSubject("수학", 70);
		
		studentLee.showStudentInfo();

	}

}
