package scheduler;

<<<<<<< HEAD
=======
//상담원 한명씩 돌아가며 동일하게 상담업무를 배분합니다.
>>>>>>> 4abdbc8 (d)
public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
<<<<<<< HEAD

		System.out.println("�긽�떞 �쟾�솕瑜� �닚�꽌���濡� ���湲곗뿴�뿉�꽌 媛��졇�샃�땲�떎 ");
=======
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
		
>>>>>>> 4abdbc8 (d)
	}

	@Override
	public void sendCallToAgent() {
<<<<<<< HEAD

		System.out.println("�떎�쓬 �닚�꽌 �긽�떞�썝�뿉寃� 諛곕텇�빀�땲�떎. ");

=======
		System.out.println("다음 순서 상담원에게 배분합니다.");
		
>>>>>>> 4abdbc8 (d)
	}

}
