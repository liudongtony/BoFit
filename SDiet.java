package com.iteye.liudongtony.bofit;

public class SDiet implements Diet {

	int calories = 2200;
	String mealPlan = "Athlete meal (daily): beef 200g, fish 200g, vegitable 500g, grain 200g";
	String recommen = "Extra supplement(weekly): protein powder * 2, vitamin dose * 2";
	int dietFee = 250;
			
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
