package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a base ingredient which could also be a additional decorator.
 *
 */
public class Espresso extends Drink{


	public Espresso()
	{
		description = "Espresso";
		cost = 1.10;
	}

	public Espresso(Drink d)
	{
		this();
		drink = d;
	}
	

}
