package interfaceex;

public class Customer implements Buy, Sell{

	@Override
<<<<<<< HEAD
	public void sell() {
		System.out.println("êµ¬ë§¤ë¥¼ í•œë‹¤. ");
	}

	@Override
	public void buy() {
		System.out.println("íŒë§¤ë¥¼ í•œë‹¤. ");
	}
	
	public void order() {
		System.out.println("ì£¼ë¬¸ì„  í•œë‹¤. ");		
	}
		
}
=======
	public void buy() {
		System.out.println("±¸¸ÅÇÏ±â");
	}

	@Override
	public void sell() {
		System.out.println("ÆÇ¸ÅÇÏ±â");
	}

	/*@Override
	public void order() {
		System.out.println("°í°´ ÆÇ¸Å ÁÖ¹®");
	}*/
}


>>>>>>> 4abdbc8 (d)
