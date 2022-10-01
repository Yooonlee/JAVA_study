package witharraylist;

import java.util.ArrayList;

class Animal{
	public void move()
	{
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move()
	{
		System.out.println("����� �� �߷� �Ƚ��ϴ�. ");
	}
	
	public void readBook()
	{
		System.out.println("����� å�� �н��ϴ�. ");
	}
}

class Tiger extends Animal{
	public void move()
	{
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�. ");
	}
	
	public void hunting() 
	{
		System.out.println("ȣ���̰� ����� �մϴ�. ");
	}
}

class Eagle extends Animal{
	public void move()
	{
		System.out.println("�������� �ϴ��� ���ϴ� ");
	}
	
	public void flying() 
	{
		System.out.print("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}
}

public class AnimalTest1 {
	
	
	 public static void main(String[] args) {
		  AnimalTest1 aTest = new AnimalTest1();
		  aTest.moveAnimal(new Human());
		  aTest.moveAnimal(new Tiger());
		  aTest.moveAnimal(new Eagle());
	 }

	 public void moveAnimal(Animal animal) { 
		  animal.move();
		  if(animal instanceof Human) {
			  Human human = (Human)animal;
			  human.readBook();
		  }else if(animal instanceof Tiger) {
			  Tiger tiger = (Tiger)animal;
			  tiger.hunting();
		  }else if (animal instanceof Eagle) {
			  Eagle eagle = (Eagle)animal;
			  eagle.flying();
		  }
		  else {
			  System.out.println("지원되지 않는 기능입니다 ");
		  }

	 }
}


