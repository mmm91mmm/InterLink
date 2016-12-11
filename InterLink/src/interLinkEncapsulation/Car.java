package interLinkEncapsulation;

public class Car {

	private String model;
	
	private String carBody;
	
	private double engineCapacity;


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarBody() {
		return carBody;
	}

	public void setCarBody(String carBody) {
		this.carBody = carBody;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", carBody=" + carBody + ", engineCapacity=" + engineCapacity + " L ]";
	}
	
	
	
}
 