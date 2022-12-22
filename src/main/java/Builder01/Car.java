package Builder01;

public class Car {

	private String engine;
	
	private String bodywork;
	
	private String whells;
	
	private String seats;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getBodywork() {
		return bodywork;
	}

	public void setBodywork(String bodywork) {
		this.bodywork = bodywork;
	}

	public String getWhells() {
		return whells;
	}

	public void setWhells(String whells) {
		this.whells = whells;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", bodywork=" + bodywork + ", whells=" + whells + ", seats=" + seats + "]";
	}
	
	
	
}
