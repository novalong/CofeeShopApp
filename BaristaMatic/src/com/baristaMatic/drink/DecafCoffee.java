package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a base ingredient which could also be a additional decorator.
 *
 */
public class DecafCoffee extends Drink{
	
	
	public DecafCoffee()
	{
		description = "Decaf Coffee";
		cost = 0.75;
	}
	
	public DecafCoffee(Drink d)
	{
		this();
		drink = d;
	}


}
