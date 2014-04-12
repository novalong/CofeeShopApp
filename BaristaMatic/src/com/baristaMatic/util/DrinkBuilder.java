package com.baristaMatic.util;

import com.baristaMatic.drink.*;

/**
 * @author naveen
 * Contains preparation logic for each Drink offered in Menu.
 * All Drinks shows in menu should have preparation logic here.
 * Each Drinks is prepared using one base ingredient like Coffee, Espresso or Decaf Coffee
 * and then adding additional decorator ingredients.
 * Returns null of now drink preparation logic found.
 *
 */
public class DrinkBuilder {

	public Drink getDrink(String drinkName) {
		Drink d = null;
		DrinkIngredientBuilder df = new DrinkIngredientBuilder();
		if(drinkName == "Caffe Latte")
		{
			d = new Espresso();
			d= df.addItem(d, "Espresso");
			d= df.addItem(d, "Streamed Milk");
		}
		
		if(drinkName == "Coffee")
		{
			d= new Coffee();
			d= df.addItem(d, "Coffee");
			d= df.addItem(d, "Coffee");
			d= df.addItem(d, "Sugar");
			d= df.addItem(d, "Cream");
		}
		
		if(drinkName == "Decaf Coffee")
		{
			d = new DecafCoffee();
			d = df.addItem(d, "Decaf Coffee");
			d = df.addItem(d, "Decaf Coffee");
			d = df.addItem(d, "Sugar");
			d= df.addItem(d, "Cream");
		}
		
		if(drinkName == "Cappuccino")
		{
			d = new Espresso();
			d= df.addItem(d, "Espresso");
			d= df.addItem(d, "Streamed Milk");
			d= df.addItem(d, "Foamed Milk");
		}
		
		if(drinkName == "Caffe Americano")
		{
			d = new Espresso();
			d= df.addItem(d, "Espresso");
			d= df.addItem(d, "Espresso");
		}
		
		if(drinkName == "Caffe Mocha")
		{
			d = new Espresso();
			d= df.addItem(d, "Cocoa");
			d= df.addItem(d, "Streamed Milk");
			d= df.addItem(d, "Whipped Cream");
		}
		
		if(d == null)
			System.out.println("Drink could not be prepared, No preparation logic found");
		return d;
		
	}

}
