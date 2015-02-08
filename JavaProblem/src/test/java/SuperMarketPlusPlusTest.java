import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class SuperMarketPlusPlusTest {

	@Test
	public void testThermalVest() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("Thermal Vest", 10, 20));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		SuperMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Thermal Vest"));
		assertThat(items.get(0).getQuality(), equalTo(19));
		assertThat(items.get(0).getSellIn(), equalTo(9));
	}

	@Test
	public void testAgedBrie() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("Aged Brie", 2, 0));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		SuperMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Aged Brie"));
		assertThat(items.get(0).getQuality(), equalTo(1));
		assertThat(items.get(0).getSellIn(), equalTo(1));
	}

	@Test
	public void testChicken() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("Chicken", 5, 7));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		SuperMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Chicken"));
		assertThat(items.get(0).getQuality(), equalTo(6));
		assertThat(items.get(0).getSellIn(), equalTo(4));
	}

}
