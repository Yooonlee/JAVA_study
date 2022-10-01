package scheduler;
<<<<<<< HEAD
import java.io.IOException;
public class SchedulerTest {

	public static void main(String[] args) throws IOException{


		//R, L, P
		System.out.println("ì „í™” ìƒë‹´ ë°°ë¶„ë°©ì‹ì„ ì„ íƒí•˜ì„¸ìš” R, L, P");
	
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
			System.out.println("ì§€ì›í•˜ì§€ ì•ŠëŠ” ê¸°ëŠ¥ìž…ë‹ˆë‹¤.");
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

		System.out.println("ÀüÈ­ »ó´ã ÇÒ´ç ¹æ½ÄÀ» ¼±ÅÃ ÇÏ¼¼¿ä.");
		System.out.println("R : ÇÑ¸í¾¿ Â÷·Ê·Î ÇÒ´ç ");
		System.out.println("L : ½¬°í ÀÖ°Å³ª ´ë±â°¡ °¡Àå ÀûÀº »ó´ã¿ø¿¡°Ô ÇÒ´ç ");
		System.out.println("P : ¿ì¼±¼øÀ§°¡ ³ôÀº °í°´ ¸ÕÀú ÇÒ´ç ");
		
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
			System.out.println("Áö¿øµÇÁö ¾Ê´Â ±â´ÉÀÔ´Ï´Ù.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
>>>>>>> 4abdbc8 (d)
