package com.iteye.liudongtony.bofit;

public class AWorkout implements Workout {
	String workoutType = "Athlete Workout"; 
	int duration = 12;	//months
	String machines = "Treadmill. Multi-Jungle Station. Elliptical. Crossover Function Trainer. Lower Body Elliptical. ";
	int workoutFee = 200;

	@Override
	public void printWorkout() {
		System.out.println("Plan Type: " + workoutType);
		System.out.println("Durations: " + duration + " months");
		System.out.println("Machines: " + machines);
		System.out.println("----------------------------------------");
		System.out.println("Subtotal(per week): $" + workoutFee);
		System.out.println("");
	}
	
}
