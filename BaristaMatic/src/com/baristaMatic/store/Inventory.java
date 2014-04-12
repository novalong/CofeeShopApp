package com.baristaMatic.store;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * @author naveen
 * Singleton representing item store for all ingredients.
 *
 */
public class Inventory {
	
	static private Inventory inventoryInstance = new Inventory();
	
	Map <String, Integer> ingredientMap = new HashMap<String, Integer>();
	List <String> inventoryList;
	
	private Inventory()
	{
		initializeInventory(10);
	}
	
	public static Inventory getInventoryInstance()
	{
		return inventoryInstance;
	}

	/**
	 * @param i
	 * Initializes all inventory items to given quantity
	 */
	public void initializeInventory(int i) {
		ingredientMap.put("Coffee", i);
		ingredientMap.put("Decaf Coffee", i);
		ingredientMap.put("Sugar", i);
		ingredientMap.put("Cream", i);
		ingredientMap.put("Steamed Milk", i);
		ingredientMap.put("Foamed Milk", i);
		ingredientMap.put("Espresso", i);
		ingredientMap.put("Cocoa", i);
		ingredientMap.put("Whipped Cream", i);
		inventoryList = new ArrayList <String>(ingredientMap.keySet());
		Collections.sort(inventoryList);
		
	}
	
	/**
	 * @param itemName
	 * @param quantity
	 * @return if there is given quantity of item in inventory.
	 * Checks given quantity of item in inventory.
	 */
	public boolean getItemStatus(String itemName, int quantity)
	{
		Integer inventoryValue = ingredientMap.get(itemName);
		if(inventoryValue == null)
		{
			System.out.println(itemName + " Item not found in inventory."); // Could also throw Exception.
			return false;
		}
		if(inventoryValue >= quantity)
			return true;
		else
			return false;
	}
	
	/**
	 * @param itemName
	 * @param quantity
	 * @return if item could be taken out
	 * Subtract given quantity of item from inventory.
	 */
	public boolean getItem(String itemName, int quantity)
	{
		if(getItemStatus(itemName, quantity))
		{
			ingredientMap.put(itemName, ingredientMap.get(itemName)-quantity);
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Displays present status of inventory to console.
	 */
	public void displayInventory()
	{
		System.out.println("Inventory:");
		for(String itemName : inventoryList)
		{
			System.out.println(itemName + "," + ingredientMap.get(itemName));
		}
	}
	
	/**
	 * @param itemName
	 * @param quantity
	 * Adds given quantity of item to inventory.
	 */
	public void putInventory(String itemName, int quantity)
	{
		if(ingredientMap.get(itemName) != null)
			ingredientMap.put(itemName, ingredientMap.get(itemName) + quantity);
	}
	
	/**
	 * @param itemName
	 * @return
	 * Returns present quantity of items.
	 */
	public int getItemQuantity(String itemName)
	{
		return ingredientMap.get(itemName);
	}

}
