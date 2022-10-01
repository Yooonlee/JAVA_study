package thisex;

class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1); //생성자에서 다른 생성자를 호출 , 이때 이 구문 앞에 어떤 문장도 와서는 안된다.
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this; // 현재 인스턴스의 주소값을 출력 
	}

}

public class CallAnotherConst {
	public static void main (String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
