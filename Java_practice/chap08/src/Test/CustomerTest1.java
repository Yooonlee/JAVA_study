package Test;

import inheritance.VIPCustomer;
import witharraylist.Customer;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(6000, "KY");

		
		VIPCustomer customerKim = new VIPCustomer(300, "Ads");
 		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
