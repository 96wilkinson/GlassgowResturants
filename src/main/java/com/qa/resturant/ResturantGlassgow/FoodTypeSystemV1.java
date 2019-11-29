package com.qa.resturant.ResturantGlassgow;

public class FoodTypeSystemV1 {

	private static final String CURRY = "Curry";
	private static final String IS_YOUR_FAVOURITE_FOOD_ITALIAN = "Is your Favourite food Italian?";
	private static final String PASTA = "Pasta";
	private static final String YES = "yes";
	private static final String IS_YOUR_FAVOURITE_FOOD_INDIAN = "Is your Favourite food Indian?";
	private static final String I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD = "I'm sorry please enter another food";
	private String favFood;
	private String Question;

	public void setInformation(String foodType, String theQuestion,String doYouWantToGoOut) {
		this.favFood = foodType;
		this.Question = theQuestion;
		this.Out = doYouWantToGoOut;
	}

	public String getInformation(String food, String theQuestion,String doYouWantToGoOut) {
		String Result = "";
		String Answer = Question;
		String Indian = food;
		String Italian = food;
		String American = food;
		String Mexican = food;
		String glassgowOut = Out;

		
		if (glassgowOut == "Yes") {
			
			if (Indian == CURRY) {
				Result = IS_YOUR_FAVOURITE_FOOD_INDIAN;
				System.out.println(Result);
	
				if (Answer == YES) {
					Result = "http://www.ranjitskitchen.com/";
					System.out.println(Result);
					return Result;
				} else {
					Result = I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD;
					System.out.println(Result);
					return Result;
				}
			} 
			else if (Italian == PASTA) {
				Result = IS_YOUR_FAVOURITE_FOOD_ITALIAN;
				System.out.println(Result);
				if (Answer == YES) {
					Result = "//http://www.quarestaurant.co.uk/";
					System.out.println(Result);
					return Result;
				} else {
					Result = I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD;
					System.out.println(Result);
					return Result;
				}
			else if (American == "Burger") {
				Result = "Is your Favourite food American";
				System.out.println(Result);
				if (Answer == YES) {
					Result = "//http://www.quarestaurant.co.uk/";
					System.out.println(Result);
					return Result;
				} else {
					Result = I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD;
					System.out.println(Result);
					return Result;
				}
			{
			else if (Mexican == "Tacos") {
				Result = "Is your Favourite food Mexican?";
				System.out.println(Result);
				if (Answer == YES) {
					Result = "//http://www.quarestaurant.co.uk/";
					System.out.println(Result);
					return Result;
				} else {
					Result = I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD;
					System.out.println(Result);
					return Result;
				}
			} 
			else {
				Result = I_M_SORRY_PLEASE_ENTER_ANOTHER_FOOD;
				System.out.println(Result);
				return Result;
			}
		}
		else {
			System.out.println("goodbye");
		}
	}
}