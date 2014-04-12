package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a base ingredient which could also be a additional decorator.
 *
 */
public class Coffee extends Drink {

	public Coffee()
	{
		description = "Coffee";
		cost = 0.75;
	}

	public Coffee(Drink d) {

		this();
		drink = d;

	}


}
