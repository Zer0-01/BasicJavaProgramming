package sem2LabAssingment2;

public class Food {
	
	private String foodItem;
	private double totalCalories;
	private double fatGrams;
	
	public Food() {
		
	}
	
	public Food(String foodItem, double totalCalories, double fatGrams) {
		
		this.foodItem = foodItem;
		this.totalCalories = totalCalories;
		this.fatGrams = fatGrams;
	}
	
	public String getFoodItem() {
		return foodItem;
	}
	
	public double getTotalCalories() {
		return totalCalories;
	}
	
	public double getFatGrams() {
		return fatGrams;
	}
	
	public void setFoodItems(String foodItem) {
		this.foodItem = foodItem;
	}
	
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}
	
	public void setFatGrams(double fatGrams) {
		this.fatGrams = fatGrams;
	}
	
	public double calcCaloriesFromFat() {
		double caloriesFromFat = fatGrams * 9;
		return caloriesFromFat;
	}
	
	public double calcPercCalFromFat() {
		double percentageCaloriesFromFat = (calcCaloriesFromFat() / totalCalories) * 100;
		return percentageCaloriesFromFat;
	}
	
	public String displayMessage() {
		String msg = "";
		if (calcCaloriesFromFat() < (30*totalCalories)/100) {
			msg = "The food is low fat";		
		}
		else if(calcCaloriesFromFat() > totalCalories) {
			msg = "ERROR!!! Input is invalid";
		}
		return msg;
	}
	
	

}
