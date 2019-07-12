package com.mounika.example;

/*Write a class named Car that has the following fields:
yearModel. The yearModel field is an int that holds the car's year model
make. The make field references a String object that holds the make of the car
speed. The speed field is an int that holds the car's current speed

In addition, the class should have the following constructor and other methods:
Constructor. The constructor should accept the car's year model and make as arguments. 
These values should be assigned to the object's yearModel and make fields. The constructor should also assign 0 to the speed field.
Accessors. Appropriate accessor methods should get the values stored in an object's yearModel,make, and speed field.

Accelerate. The accelerate method should add 5 to the speed field each time it is called
Brake. The brake method should subtract 5 from the sped field each time it is called.
Demonstra te the class in a program that creates a Car object, and then calls the accelerate method five times. 
After each call to the accelerate method, get the current speed of the car and display it. 
Then call the brake method five times. After each call to the brake method, get the current speed of the car and display it.*/

public class Car {
	private int yearModel;
	private String make;
	private int speed;
	

	public Car(int Model, String carMake){
		yearModel = Model;
		make = carMake;
		speed = 0;
	}


	public int getYearModel() {
		return yearModel;
	}


	public String getMake() {
		return make;
	}


	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		speed += 5;
	}
	
	public void brake() {
		speed -= 5;
	}

	public static void main(String[] args) {
		
		Car car = new Car(2018, "Jetta");
		for(int i=0;i<5;i++) {
			car.accelerate();
			System.out.println("Current speed is: " +car.speed );
		}
		for(int j=0;j<5;j++) {
			car.brake();
			System.out.println("Current Speed is: " +car.speed );
		}
		
	}
	
	
	
	  
	
	
	

}
