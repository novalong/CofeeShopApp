package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a additional decorator ingredient.
 *
 */
public class WhippedCream extends AdditionalDecorator {

	public WhippedCream(Drink d) {
		super(d);
		description = "Whipped Cream";
		cost = 1;
	}

}
