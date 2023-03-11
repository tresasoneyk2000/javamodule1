package oopsday1.setgetconstructors;

public class Car {
	// properties, data members, instance variables
	private String colour;
	private double price;
	
	public Car(String colour, double price, String brand, String model) {
		
		this.colour = colour;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	public Car() {};
	@Override
	public String toString() {
		return "I am a "+ brand;}
	private String brand;
	private String model;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
