package test3;

//Create a class
public class CarClass {


	public static void main(String[] args) {
	CarClass car1 = new CarClass("BMW", "blue", "Steel", "cave", 6 ); //objects are instantiated
	CarClass car2 = new CarClass("RangeRover","black", "Iron", "storage",2);
	CarClass car3 = new CarClass("Lexsus","white", "Ash", "garage", 3);
	CarClass car4 = new CarClass("Fiat","red","Rock", "street", 12);
	CarClass car5 = new CarClass("Chevy", "green", "aluminum", "dealer", 7);
	
	
	
	car1.tellMeAboutYourcar();
	car2.carType();
	car4.carMake();
		
	}
		// attributes
	String make;
	String color;
	String madeof;
	String storage;
	int  age ;

		// this is the constructor
	CarClass(String make, String color, String madeof, String storage, int age){
		this.make = make;
		this.color = color;
		this.madeof = madeof;
		this.storage = storage;
		this.age = age;	
		
} 
	//change value of attribute 
	public void carType() {
	this.age +=10;
	System.out.println("Some cars last for " + this.age);
			
	}
	
	public void carMake( ) {
	this.age -=5;
		System.out.println("Cars are typically traded at year " + this.age);
	}
		
	public void tellMeAboutYourcar() {
	System.out.println("What is the make? "  + this.make); // this is a function
	System.out.println("What is the color? "  + this.color);
	System.out.println("What material is it made of? "  + this.madeof);
	System.out.println("Where do you keep it? "  + this.storage);
	System.out.println("How many years have you had it? "  + this.age);
	}
}
