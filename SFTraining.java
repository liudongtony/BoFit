package com.iteye.liudongtony.bofit;

public class SFTraining implements FTraining {
	
	String trainingClass = "Senior Training Class"; 
	String schedule = "Tuesday. Thursday. Saturday. ";
	int trainingFee = 450;

	@Override
	public void printFTraining() {
		System.out.println("Class Name: " + trainingClass);
		System.out.println("Schedule: " + schedule);
		System.out.println("----------------------------------------");
		System.out.println("Subtotal(per week): $" + trainingFee);
		System.out.println("");
	}

}
