package com.qa.resturant.ResturantGlassgow;

import org.junit.Test;

import junit.framework.Assert;

public class ResturantTypeTestV1 {

	private static final String YES = "yes";
	private static final String CURRY = "Curry";
	private static final String PASTA = "Pasta";

	@Test
	public void testFave() {
		FoodTypeSystemV1 food = new FoodTypeSystemV1();
		food.setFoodType(CURRY);

		FoodTypeSystemV1 Question = new FoodTypeSystemV1();
		Question.setQuestion(YES);

		String foodType = food.getFoodType(CURRY);
		String theQuestion = Question.getQuestion(YES);

		Assert.assertEquals("Is your Favourite food Indian?", foodType);
		Assert.assertEquals("http://www.ranjitskitchen.com/", theQuestion);
	}

}