package scheduler;
<<<<<<< HEAD
import java.io.IOException;
public class SchedulerTest {

	public static void main(String[] args) throws IOException{


		//R, L, P
		System.out.println("전화 상담 배분방식을 선택하세요 R, L, P");
	
		int ch = System.in.read();
		Scheduler scheduler = null ;
		
		if(ch == 'R' ||ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' ||ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' ||ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
			
	}
}
=======

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("��ȭ ��� �Ҵ� ����� ���� �ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ� ");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ� ");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ� ");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r'){
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l'){
			scheduler = new LeastJob();
		}
		else if(ch == 'P'|| ch == 'p'){
			scheduler = new PriorityAllocation();
		}
		else{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
>>>>>>> 4abdbc8 (d)
