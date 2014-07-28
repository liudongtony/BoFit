package com.iteye.liudongtony.bofit;

public class SWorkout implements Workout{
	String workoutType = "Senior Workout"; 
	int duration = 9;	//months
	String machines = "Treadmill. Multi-Jungle Station. Elliptical. Crossover Function Trainer. ";	
	int workoutFee = 120;

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
