package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a additional decorator ingredient.
 *
 */
public class Sugar extends AdditionalDecorator {

	public Sugar(Drink d)
	{
		super(d);
		description = "Sugar";
		cost = 0.25;
	}

	/*@Override
	public double cost() {
		return drink.cost() + 0.25;
	}*/

}
