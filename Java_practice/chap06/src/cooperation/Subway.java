package cooperation;

public class Subway {


		int lineNumber;
		int money;
		int passengerCount;
		
		public Subway (int lineNumber, int money) {
			this.lineNumber = lineNumber;
			this.money = money;
		}
		
		public void take (int money) {
			this.money += money;
			passengerCount++;
		}
		
		public void showInfo() {
			System.out.println("지하철" + lineNumber + "번의 승객은"  + passengerCount + "명이고, 수입은" 
					+ money + "입니다");
			
		}
		
	

}
