package com.iteye.liudongtony.bofit;

public class ADiet implements Diet {

	int calories = 4000;
	String mealPlan = "Athlete meal (daily): beef 300g, fish 300g, vegitable 500g, grain 300g";
	String recommen = "Extra supplement(weekly): protein powder * 3, vitamin dose * 3";
	int dietFee = 300;
			
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
