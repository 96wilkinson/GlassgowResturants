package com.qa.resturant.ResturantGlassgow;

public class FoodTypeSystemV1 {

	private static final String IS_YOUR_FAVOURITE_FOOD_INDIAN = "Is your Favourite food Indian?";
	private static final String I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD = "I'm sorry please enter another food";
	private String favFood;
	private String Question;

	public void setInformation(String foodType,String theQuestion) {
		this.favFood = foodType;
		this.Question = theQuestion;
	}


	public String getInformation(String food,String theQuestion) {
		String Result = "";
		String Indian = food;
		String Italian = food;
		
		if (Indian == "Curry") {
			Result = IS_YOUR_FAVOURITE_FOOD_INDIAN;
			System.out.println(Result);
			return Result;
			
		}
		else if (Italian == "Pasta") {
			Result = "Is your Favourite food Italian?";
			System.out.println(Result);
			return Result;
		} 
		else {
			Result = I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD;
			System.out.println(Result);
			return Result;
		}
	}
		//NEED TO PLACE THIS IN INDIAN
	public String getQuestion(String Question) {
		String Result = "";
		String Answer = Question;
		if (Answer == "yes") {
			Result = "http://www.ranjitskitchen.com/";
			System.out.println(Result);
			return Result;
		} else {
			Result = I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD;
			System.out.println(Result);
			return Result;
		}
	}
}