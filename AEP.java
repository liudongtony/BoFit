package com.iteye.liudongtony.bofit;

public class AEP extends ExercisePlan {

	@Override
	public Workout createWorkout() {
		return new AWorkout();		
	}

	@Override
	public FTraining createTraining() {
		return new AFTraining();		
	}

	@Override
	public Diet createDiet() {
		return new ADiet();
	}

}
