package com.baristaMatic.drink;

import com.baristaMatic.store.Inventory;


/**
 * @author naveen
 * 
 * Represents a Drink ingredient in BaristaMatic shop.
 * Each drink has a cost and description.
 *
 */
public abstract class Drink {
	double cost;
	String description = "Unknown";
	Drink drink;

	/*public abstract double cost();*/
	
	/*public abstract String getDescription();*/

	/**
	 * @return 
	 * Takes out current drink item from inventory.    
	 *    True if item was successfully taken out.
	 *    False if Drink could not be completely prepared.
	 * if False, then return all the items previously taken from inventory for present drink.(Hypothetical)
	 */
	public boolean getItemFromInventory() {
		if(drink != null && !drink.getItemFromInventory())
			return false;
		boolean value = Inventory.getInventoryInstance().getItem(description, 1);
		if(drink != null && !value)
			drink.returnInventory();
		return value;
	}

	/**
	 * returns items to inventory for present drink.
	 */
	private void returnInventory() {
		if(drink != null)
			drink.returnInventory();

		Inventory.getInventoryInstance().putInventory(description, 1);

	}

	/**
	 * @return is enough inventory for present Drink.
	 * Checks inventory status for present Drink by trying to take out item successfully.
	 * Then returning the item to reset any changes.
	 */
	public boolean checkInventory()
	{
		boolean value = getItemFromInventory();
		if(value)
			returnInventory();
		return value;
	}
	

	
	/**
	 * @return cost of Drink.
	 */
	public double cost() {
		if(drink == null)
			return cost;
		else
			return drink.cost() + cost;
	}

	
	/**
	 * @return Returns string representing drink composition.(Debugging).
	 */
	public String getDescription() {
		if(drink == null)
			return description;
		else
			return drink.getDescription() + " " + description;
	}


}
