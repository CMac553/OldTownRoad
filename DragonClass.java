package test3;

//Create a class
public class DragonClass {


	public static void main(String[] args) {
	DragonClass dragon1 = new DragonClass("Drago", "male", "Steel", "castle", 160 ); //objects are instantiated
	DragonClass dragon2 = new DragonClass("Pointy","female", "Iron", "mountain",245);
	DragonClass dragon3 = new DragonClass("Golden","female", "Ash", "oilMine", 332);
	DragonClass dragon4 = new DragonClass("Ozzy","male","Rock", "theGround", 642);
	DragonClass dragon5 = new DragonClass("Steeko", "male", "Titanium", "theSea", 540);
	
	
	
	dragon1.tellMeAboutYourself();
	dragon2.skinType();
	dragon4.dragonName();
		
	}
		// attributes
	String name;
	String gender;
	String skin;
	String live;
	int  age ;

		// this is the constructor
		DragonClass(String name, String gender, String skin, String live, int age){
		this.name = name;
		this.gender = gender;
		this.skin = skin;
		this.live = live;
		this.age = age;	
		
 } 
 	//change value of attribute 
	public void skinType() {
	this.age +=500;
	System.out.println("Dragons with fire breath live to be " + this.age);
			
	}
	
	public void dragonName( ) {
	this.age -=100;
		System.out.println("Dragons typically die at the age of " + this.age);
	}
		
 	public void tellMeAboutYourself() {
 	System.out.println("What is your name? "  + this.name); // this is a function
 	System.out.println("What is your sex? "  + this.gender);
 	System.out.println("What type of skin do you have? "  + this.skin);
 	System.out.println("Where do you live? "  + this.live);
 	System.out.println("How old are you? "  + this.age);
 	}
}
