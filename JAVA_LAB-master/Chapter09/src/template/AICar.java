package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행합니다. ");
		System.out.println("자동으로 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동으로 스스로 멈춥니다.");		
	}

	@Override
	public void wiper() {
		System.out.println("사람이 수동으로 와이퍼를 조절합니다.");
	}

	@Override
	public void washCar() {
		System.out.println("자동으로 세차가 됩니다.");
	}
}
