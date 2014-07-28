package com.iteye.liudongtony.bofit;

public class SEP extends ExercisePlan {

	@Override
	public Workout createWorkout() {
		return new SWorkout();		
	}

	@Override
	public FTraining createTraining() {
		return new SFTraining();		
	}

	@Override
	public Diet createDiet() {
		return new SDiet();
	}
}
