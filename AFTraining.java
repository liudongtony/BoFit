package com.iteye.liudongtony.bofit;

public class AFTraining implements FTraining {
	
	String trainingClass = "Athlete Training Class"; 
	String schedule = "Monday. Tuesday. Wednesday. Thursday. Saturday. ";
	int trainingFee = 750;

	@Override
	public void printFTraining() {
		System.out.println("Class Name: " + trainingClass);
		System.out.println("Schedule: " + schedule);
		System.out.println("----------------------------------------");
		System.out.println("Subtotal(per week): $" + trainingFee);
		System.out.println("");
	}

}
