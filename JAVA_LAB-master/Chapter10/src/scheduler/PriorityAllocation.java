package scheduler;

<<<<<<< HEAD
public class PriorityAllocation implements Scheduler {
	public void getNextCall() {
		System.out.println("ê³ ê°ì˜ ë“±ê¸‰ì´ ë†’ì€ ê³ ê°ì˜ ì „í™”ë¥¼ ë¨¼ì € ê°€ì ¸ì˜µë‹ˆë‹¤. ");
		
	}
	public void sendCallToAgent() {
		System.out.println("ì—…ë¬´ skillì´ ê°€ìž¥ ë†’ì€ ìƒë‹´ì›ì˜ ëŒ€ê¸°ì—´ì˜ ì•žì— ìš°ì„  ë°°ë¶„í•©ë‹ˆë‹¤. ");
=======
// °í°´µî±ÞÀÌ ³ôÀº °í°´ºÎÅÍ ´ë±â¿­¿¡¼­ °¡Á®¿Í ¾÷¹« ´É·ÂÀÌ ³ôÀº »ó´ã¿ø ¿ì¼±À¸·Î ¹èºÐÇÕ´Ï´Ù.
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("°í°´ µî±ÞÀÌ ³ôÀº °í°´ÀÇ ÀüÈ­¸¦ ¸ÕÀú °¡Á®¿É´Ï´Ù.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("¾÷¹« skill °ªÀÌ ³ôÀº »ó´ã¿ø¿¡°Ô ¿ì¼±ÀûÀ¸·Î ¹èºÐÇÕ´Ï´Ù.");
		
>>>>>>> 4abdbc8 (d)
	}
}
