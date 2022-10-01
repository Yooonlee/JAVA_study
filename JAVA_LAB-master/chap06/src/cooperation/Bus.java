package cooperation;

public class Bus {

	int busNumber;
	int money;
	int passengerCount;
	
	public Bus (int busNumber, int money) {
		this.busNumber = busNumber;
		this.money = money;
	}
	
	public void take (int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은"  + passengerCount + "명이고, 수입은" 
				+ money + "입니다");
		
	}
	
}
