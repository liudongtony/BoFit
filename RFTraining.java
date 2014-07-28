package com.iteye.liudongtony.bofit;

public class RFTraining implements FTraining {
	
	String trainingClass = "Regular Training Class"; 
	String schedule = "Tuesday. Friday. ";
	int trainingFee = 300;

	@Override
	public void printFTraining() {
		System.out.println("Class Name: " + trainingClass);
		System.out.println("Schedule: " + schedule);
		System.out.println("----------------------------------------");
		System.out.println("Subtotal(per week): $" + trainingFee);
		System.out.println("");
	}

}
