package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {} //default 생성자를 만들어줌 
	
	public Student(int id, String name) { // 생성자 오버로딩 = 같은 이름의 생성자가 겹친다.
		studentID = id;
		studentName = name;
	}
	public void studentInfo() { //매서드도 오버로딩이 일어날 수 있다. 
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
