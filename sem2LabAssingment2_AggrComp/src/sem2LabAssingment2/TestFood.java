
package sem2LabAssingment2;

public class TestFood {

	public static void main(String[] args) {
		
		
		
		Food food1 = new Food ("Crunchy Peanut", 539.7, 32.22);
		System.out.println(food1.getFoodItem() + ": ");
		System.out.printf("Total Calories= %.1f \nFat (gram)= %.2f\n", food1.getTotalCalories(), food1.getFatGrams());
		System.out.printf("Calories from fat: %.2f \n",food1.calcCaloriesFromFat());
		System.out.printf("Calories percentage from fat: %.2f%% \n",food1.calcPercCalFromFat());
		System.out.printf("%s \n",food1.displayMessage());

		System.out.println();
		
		Food food2 = new Food ("Muruku", 111.0, 7.00);
		System.out.println(food2.getFoodItem() + ": ");
		System.out.printf("Total Calories= %.1f \nFat (gram)= %.2f\n", food2.getTotalCalories(), food2.getFatGrams());
		System.out.printf("Calories from fat: %.2f \n",food2.calcCaloriesFromFat());
		System.out.printf("Calories percentage from fat: %.2f%% \n",food2.calcPercCalFromFat());
		System.out.printf("%s \n",food2.displayMessage());
		
		System.out.println();
		
		Food food3 = new Food ("Food A", 211.0, 7.00);
		System.out.println(food3.getFoodItem() + ": ");
		System.out.printf("Total Calories= %.1f \nFat (gram)= %.2f\n", food3.getTotalCalories(), food3.getFatGrams());
		System.out.printf("Calories from fat: %.2f \n",food3.calcCaloriesFromFat());
		System.out.printf("Calories percentage from fat: %.2f%% \n",food3.calcPercCalFromFat());
		System.out.printf("%s \n",food3.displayMessage());
		
		System.out.println();

		
		Food food4 = new Food ("Nasi Lemak", 644.0, 83.0);
		System.out.println(food4.getFoodItem() + ": ");
		System.out.printf("Total Calories= %.1f \nFat (gram)= %.2f\n", food4.getTotalCalories(), food4.getFatGrams());
		System.out.printf("Calories from fat: %.2f \n",food4.calcCaloriesFromFat());
		System.out.printf("Calories percentage from fat: %.2f%% \n",food4.calcPercCalFromFat());
		System.out.printf("%s \n",food4.displayMessage());
	}

}
