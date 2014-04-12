/**
 * 
 */
package com.baristaMatic.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.baristaMatic.store.Inventory;
import com.baristaMatic.util.DrinkBuilder;
import com.baristaMatic.util.Menu;

/**
 * @author naveen
 *
 */
public class MenuTest {
	
	DrinkBuilder df = new DrinkBuilder();


	/**
	 * Test method for {@link com.baristaMatic.util.Menu#getDrink(int)}.
	 */
	@Test
	public void testGetDrink() {
		Menu m = new Menu();
		
		//Check inventory for Caffe latte creation.
		//Drink caffeLatte = df.getDrink("Caffe Latte");
		Integer initEspresso = Inventory.getInventoryInstance().getItemQuantity("Espresso");
		Integer initSteamMilk = Inventory.getInventoryInstance().getItemQuantity("Steamed Milk");
		m.getDrink(2);
		Integer endEspresso = Inventory.getInventoryInstance().getItemQuantity("Espresso");
		Integer endSteamMilk = Inventory.getInventoryInstance().getItemQuantity("Steamed Milk");
		assertEquals(Integer.valueOf(initEspresso-2), Integer.valueOf(endEspresso));
		assertEquals(Integer.valueOf(initSteamMilk-1), Integer.valueOf(endSteamMilk));
		
		
	}

}
