package spring_demo;

//import lombok.Data;

//@Data
public class Car {
String brand;
String Color;
double price;

MusicSystem system;

public MusicSystem getSystem() {
	return system;
}
public void setSystem(MusicSystem system) {
	this.system = system;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Car [brand=" + brand + ", Color=" + Color + ", price=" + price + ", system=" + system + "]";
}
}

