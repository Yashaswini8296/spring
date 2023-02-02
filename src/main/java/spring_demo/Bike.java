package spring_demo;

public class Bike {
String Company;
int CC;
String Color;
MusicSystem system;


public Bike(String company, int cC, String color, MusicSystem system) {
    super();
	Company = company;
	CC = cC;
	Color = color;
	this.system = system;
}
public Bike() {
}
@Override
   public String toString() {
   return "Bike [Company=" + Company + ", CC=" + CC + ", Color=" + Color + ", system=" + system + "]";	
}
}
