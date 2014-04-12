package com.baristaMatic.drink;
/**
 * @author naveen
 * Represents a additional decorator ingredient.
 *
 */
public class Cocoa extends AdditionalDecorator {

	public Cocoa(Drink d) {
		super(d);
		description = "Cocoa";
		cost = 0.90;
	}


}
