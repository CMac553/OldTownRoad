package test3;


//Create a class
public class HumanClass {


	public static void main(String[] args) {
	HumanClass human1 = new HumanClass("BlackPant", "male", "no", "no", 30 ); //objects are instantiated
	HumanClass human2 = new HumanClass("IronM","male", "no", "no", 45);
	HumanClass human3 = new HumanClass("Widow","female", "no", "no", 32);
	HumanClass human4 = new HumanClass("Hulk","male","no", "no", 42);
	HumanClass human5 = new HumanClass("Lokey", "male", "no", "no", 40);
	
	
	
	human1.tellMeAboutLife();
	human3.gotMarried();
	human4.beASuperhero();
	
	
	}
	

	// attributes
	String name;
	String gender;
	String married;
	String children;
	int  age ;

		// this is the constructor
		HumanClass(String name, String gender, String married, String children,int age){
		this.name = name;
		this.gender = gender;
		this.married = married;
		this.children = children;
		this.age = age;	
		
 } 
 	//change value of attribute 
	public void gotMarried() {
	this.age +=10;
	System.out.println("Got married and feel " + this.age);
			
	}
	
	public void beASuperhero( ) {
	this.age -=15;
		System.out.println("When changing into hulk, act " + this.age);
	}
		
 	public void tellMeAboutLife() {
 	System.out.println("Which superhero are you? "  + this.name); // this is a function
 	System.out.println("What is your sex? "  + this.gender);
 	System.out.println("Are you married? "  + this.married);
 	System.out.println("Do you have kids? "  + this.children);
 	System.out.println("How old are you? "  + this.age);
 	}
}
