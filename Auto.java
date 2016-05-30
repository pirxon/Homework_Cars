public class Auto {
	private String carModel; // название модели машины
	private Engine engine;   // двигатель
	private Transmission transmission; // КПП
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Transmission getTransmission() {
		return transmission;
	}
	public void setTransmision(Transmission transmission) {
		this.transmission = transmission;
	}	
	
}
