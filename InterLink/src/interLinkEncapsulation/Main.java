package interLinkEncapsulation;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setCarBody("Cabriolet");
		car.setModel("Nissan");
		car.setEngineCapacity(3.5);
		System.out.println(car);
		
		System.out.println(car.getCarBody() + "  " + car.getEngineCapacity() + "L");
		
	}
}
