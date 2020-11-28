package application;

public class Mountain {
	// instance variables
	private String name;
	private int heightMeters;
	private double peakTemperature;

	// constructor
	public Mountain(String name, int heightMeters, double peakTemperature) {
		this.name = name;
		this.heightMeters = heightMeters;
		this.peakTemperature = peakTemperature;
	}

	// getters and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return this.heightMeters;
	}

	public void setHeight(int heightMeters) {
		this.heightMeters = heightMeters;
	}

	public double peakTemperatire() {
		return this.peakTemperature;
	}

	public void setpeakTemperature(double peakTemperature) {
		this.peakTemperature = peakTemperature;
	}

	// toString method
	@Override
	public String toString() {
		return "Mountain name: " + this.name + "\n" + "Height (m): " + this.heightMeters + "\n"
				+ "Peak Temperature (°C): " + this.peakTemperature + "\n";
	}

}
