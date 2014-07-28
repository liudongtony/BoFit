package com.iteye.liudongtony.bofit;

public class RWorkout implements Workout{
	String workoutType = "Regular Workout"; 
	int duration = 6;	//months
	String machines = "Treadmill. Multi-Jungle Station. ";	
	int workoutFee = 150;

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
