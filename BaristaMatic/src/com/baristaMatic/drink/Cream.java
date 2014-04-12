package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a additional decorator ingredient.
 *
 */
public class Cream extends AdditionalDecorator {
	
	public Cream(Drink d)
	{
		super(d);
		description = "Cream";
		cost = 0.25;
	}

	/*@Override
	public double cost() {
		return drink.cost() + 0.25;
	}*/

	

}
