package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("구매를 한다. ");
	}

	@Override
	public void buy() {
		System.out.println("판매를 한다. ");
	}
	
	public void order() {
		System.out.println("주문을  한다. ");		
	}
		
}
