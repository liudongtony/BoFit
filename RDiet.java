package com.iteye.liudongtony.bofit;

public class RDiet implements Diet {
	
	int calories = 2000;
	String mealPlan = "Athlete meal (daily): beef 200g, fish 200g, vegitable 500g, grain 180g";
	String recommen = "Extra supplement(weekly): protein powder * 1, vitamin dose * 1";
	int dietFee = 220;
			
	@Override
	public void printDiet() {
		System.out.println(mealPlan);
		System.out.println("Total Calories(per day): " + calories);
		System.out.println(recommen);
		System.out.println("----------------------------------------");
		System.out.println("Subtotal(per week): $" + dietFee);
		System.out.println("");
	}

}
