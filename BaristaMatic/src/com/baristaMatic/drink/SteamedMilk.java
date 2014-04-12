package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a additional decorator ingredient.
 *
 */
public class SteamedMilk extends AdditionalDecorator {

	
	public SteamedMilk(Drink d)
	{
		super(d);
		description = "Steamed Milk";
		cost = 0.35;
	}

	/*@Override
	public double cost() {
		return drink.cost() + 0.35;
	}*/
	

}
