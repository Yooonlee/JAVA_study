package interfaceex;

public class CustomerTest {
<<<<<<< HEAD
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();
		buyer.order();
		seller.order(); //가상 메서드 :오버라이딩된 메서드가불림 
	
	}
}
=======

	public static void main(String[] args) {

		Customer customer = new Customer();
	
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if( seller instanceof Customer){
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		
		customer.order();
	}
}


>>>>>>> 4abdbc8 (d)
