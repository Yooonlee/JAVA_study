package scheduler;

<<<<<<< HEAD
public class PriorityAllocation implements Scheduler {
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다. ");
		
	}
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 높은 상담원의 대기열의 앞에 우선 배분합니다. ");
=======
// ������� ���� ������ ��⿭���� ������ ���� �ɷ��� ���� ���� �켱���� ����մϴ�.
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
		
>>>>>>> 4abdbc8 (d)
	}
}
