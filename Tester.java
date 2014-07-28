package com.iteye.liudongtony.bofit;

/*
 * Finished UI, abstract factories
 */
public class Tester {
	public static void main(String[] args) {
		ExercisePlan plan = new AEP();
		Workout wo = plan.createWorkout();
		wo.printWorkout();
		FTraining tf = plan.createTraining();
		tf.printFTraining();
		Diet dt = plan.createDiet();
		dt.printDiet();
	}
}
