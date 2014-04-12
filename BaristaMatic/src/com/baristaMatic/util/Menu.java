package com.baristaMatic.util;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baristaMatic.drink.Drink;


/**
 * @author naveen
 * 
 * Display menu and process user input.
 *
 */
public class Menu {

	static Map <String, Drink> StoreDrinks = new HashMap <String, Drink>(); 
	List <String> drinkNames;
	DrinkBuilder df = new DrinkBuilder();

	/**
	 * Construct for Menu to be displayed.
	 * For every new Drink add name to this list.
	 */
	public Menu()
	{
		// TODO: Type check. add unit Test.
		getDrink("Coffee");
		getDrink("Decaf Coffee");
		getDrink("Caffe Latte");
		getDrink("Caffe Americano");
		getDrink("Caffe Mocha");
		getDrink("Cappuccino");
		drinkNames = new ArrayList<String>(StoreDrinks.keySet());
		Collections.sort(drinkNames);
	}

	/**
	 * Display current menu with status and cost on command line.
	 */
	public void displayMenu() {
		DecimalFormat deciFormat = new DecimalFormat("#.00");

		System.out.println("Menu:");
		int count = 1;
		for(String itemName : drinkNames)
		{
			System.out.println(count + "," + itemName
					+ ",$" + deciFormat.format(StoreDrinks.get(itemName).cost())
					+ "," + StoreDrinks.get(itemName).checkInventory()); // Could cache Cost.
			count++;
		}

	}

	/**
	 * @param itemName
	 * @return Drink for given name.
	 * Get Drink for the given drink name.
	 */
	private Drink getDrink(String itemName) {
		Drink drink =  df.getDrink(itemName);
		StoreDrinks.put(itemName, drink);
		return drink;
	}

	/**
	 * @param i
	 * @return Drink selected by input
	 * 
	 * Given the user input integer, call to to get drink.
	 * Display result of get drink call.
	 */
	public Drink getDrink(int i)
	{
		String drinkName = drinkNames.get(i-1);
		Drink drink = StoreDrinks.get(drinkName);
		if(!drink.getItemFromInventory())
			System.out.println("Out of stock: " + drinkName);
		else
			System.out.println("Dispensing: " + drinkName);
		
		return drink;
		

	}

}
