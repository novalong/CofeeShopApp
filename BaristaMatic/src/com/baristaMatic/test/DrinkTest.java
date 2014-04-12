/**
 * 
 */
package com.baristaMatic.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.baristaMatic.drink.Drink;
import com.baristaMatic.store.Inventory;
import com.baristaMatic.util.DrinkBuilder;
import com.baristaMatic.util.Menu;

/**
 * @author naveen
 *
 */
public class DrinkTest {

	/**
	 * Test method for {@link com.baristaMatic.drink.Drink#checkInventory()}.
	 */
	@Test
	public void testCheckInventory() {
		DrinkBuilder df = new DrinkBuilder();
		Drink caffeLatte = df.getDrink("Caffe Latte");
		Integer initEspresso = Inventory.getInventoryInstance().getItemQuantity("Espresso");
		Integer initSteamMilk = Inventory.getInventoryInstance().getItemQuantity("Steamed Milk");
		Menu m = new Menu();
		m.getDrink(2);
		while(true)
		{
			initEspresso = Inventory.getInventoryInstance().getItemQuantity("Espresso");
			initSteamMilk = Inventory.getInventoryInstance().getItemQuantity("Steamed Milk");
			if(initEspresso >=2 && initSteamMilk >= 1)
			{
				assertTrue(caffeLatte.checkInventory());
				caffeLatte.getItemFromInventory();
			}
			else
			{
				assertFalse(caffeLatte.checkInventory());
				return;
			}
		}
	}

	/**
	 * Test method for {@link com.baristaMatic.drink.Drink#cost()}.
	 */
	@Test
	public void testCost() {
		DrinkBuilder df = new DrinkBuilder();
		Drink caffeLatte = df.getDrink("Caffe Latte");
		Double value = caffeLatte.cost();
		assertEquals(value, 2.55, .001);
		
		Drink caffeAmericano = df.getDrink("Caffe Americano");
		value = caffeAmericano.cost();
		assertEquals(value, 3.30, .001);
		
		Drink caffeMocha = df.getDrink("Caffe Mocha");
		value = caffeMocha.cost();
		assertEquals(value, 3.35, .001);
		
		Drink cappuccino = df.getDrink("Cappuccino");
		value = cappuccino.cost();
		assertEquals(value, 2.90, .001);
		
		Drink coffee = df.getDrink("Coffee");
		value = coffee.cost();
		assertEquals(value, 2.75, .001);
				
		
	}
/**
	 * Test method for {@link com.baristaMatic.drink.Drink#getDescription()}.
	 */
	@Test
	public void testGetDescription() {
		DrinkBuilder df = new DrinkBuilder();
		Drink caffeLatte = df.getDrink("Caffe Latte");
		String desc = caffeLatte.getDescription();
		assertEquals(desc, "Espresso Espresso Steamed Milk");
		
		Drink caffeAmericano = df.getDrink("Caffe Americano");
		desc = caffeAmericano.getDescription();
		assertEquals(desc,"Espresso Espresso Espresso");
		
		Drink caffeMocha = df.getDrink("Caffe Mocha");
		desc = caffeMocha.getDescription();
		assertEquals(desc, "Espresso Cocoa Steamed Milk Whipped Cream");
		
		Drink cappuccino = df.getDrink("Cappuccino");
		desc = cappuccino.getDescription();
		assertEquals(desc,"Espresso Espresso Steamed Milk Foamed Milk");
		
		Drink coffee = df.getDrink("Coffee");
		desc = coffee.getDescription();
		assertEquals(desc, "Coffee Coffee Coffee Sugar Cream");
	}

}
