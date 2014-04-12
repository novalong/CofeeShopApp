package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a additional decorator ingredient.
 *
 */
public class FoamedMilk extends AdditionalDecorator {

	public FoamedMilk(Drink d) {
		super(d);
		description = "Foamed Milk";
		cost = 0.35;
	}


}
