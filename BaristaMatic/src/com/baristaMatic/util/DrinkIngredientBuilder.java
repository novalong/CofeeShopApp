package com.baristaMatic.util;

import com.baristaMatic.drink.*;

/**
 * @author naveen
 * Created instances of ingredient.
 * Each item instantiated must be present in inventory.
 *
 */
public class DrinkIngredientBuilder {

	public Drink addItem(Drink d, String itemName) {
		if(itemName == "Espresso")
			return new Espresso(d);
		else if(itemName == "Streamed Milk")
			return new SteamedMilk(d);
		else if(itemName == "Coffee")
			return new Coffee(d);
		else if(itemName == "Decaf Coffee")
			return new DecafCoffee(d);
		else if(itemName == "Sugar")
			return new Sugar(d);
		else if(itemName == "Streamed Milk")
			return new SteamedMilk(d);
		else if(itemName == "Cream")
			return new Cream(d);
		else if(itemName == "Foamed Milk")
			return new FoamedMilk(d);
		else if(itemName == "Cocoa")
			return new Cocoa(d);
		else if(itemName == "Whipped Cream")
			return new WhippedCream(d);
		else
			System.out.println("Ingredient not found : " + itemName);
		return d;
	}

}
