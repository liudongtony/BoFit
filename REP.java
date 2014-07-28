package com.iteye.liudongtony.bofit;

public class REP extends ExercisePlan {

	@Override
	public Workout createWorkout() {
		return new RWorkout();		
	}

	@Override
	public FTraining createTraining() {
		return new RFTraining();		
	}

	@Override
	public Diet createDiet() {
		return new RDiet();
	}
	
}
