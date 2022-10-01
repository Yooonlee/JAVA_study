package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerlist = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10011, "이순");
		GoldCustomer customerHong = new GoldCustomer(10012, "신");
		GoldCustomer customerYul = new GoldCustomer(10013, "이순신");
		VIPCustomer customerKim = new VIPCustomer(10014, "이순신", 12345);
		
		customerlist.add(customerLee);
		customerlist.add(customerShin);
		customerlist.add(customerHong);
		customerlist.add(customerYul);
		customerlist.add(customerKim);
		  
		System.out.println("========고객정보 출력 ====");
		for(Customer customer : customerlist) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("=====할인율과 보너스 포인트 결과====");
		
		int price=10000;
		for(Customer customer: customerlist) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost +"를  지불하셨습니다 ");
			System.out.println(customer.showCustomerInfo());
		}
		
	}

}
