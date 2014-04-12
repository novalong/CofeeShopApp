package com.baristaMatic.drink;

/**
 * @author naveen
 * Represents all ingredients that can be added to drink.
 * To add these ingredients a drink must already be created.
 *
 */
public abstract class AdditionalDecorator extends Drink{
	AdditionalDecorator(Drink d)
	{
		drink = d;
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " " + description;
	}

}
