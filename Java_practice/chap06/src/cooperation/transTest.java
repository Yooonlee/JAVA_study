package cooperation;

public class transTest {
	public static void main (String[] args) {
		Student student1 = new Student("이경윤",10000);
		Bus bus1 = new Bus(1, 100000);
		student1.takeBus(bus1);
		System.out.println(student1.money);		
		System.out.println(bus1.money);		
		System.out.println(bus1.passengerCount);		
	
	}
}
