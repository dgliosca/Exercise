import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class SuperMarketPlusPlusTest {

	@Test
	public void testThermalVest() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Thermal Vest", 10, 20));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Thermal Vest"));
		assertThat(items.get(0).getQuality(), equalTo(19));
		assertThat(items.get(0).getSellIn(), equalTo(9));
	}

	@Test
	public void testAgedBrie() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Aged Brie", 2, 0));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Aged Brie"));
		assertThat(items.get(0).getQuality(), equalTo(1));
		assertThat(items.get(0).getSellIn(), equalTo(1));
	}

	@Test
	public void testChicken() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Chicken", 5, 7));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Chicken"));
		assertThat(items.get(0).getQuality(), equalTo(6));
		assertThat(items.get(0).getSellIn(), equalTo(4));
	}

	@Test
	public void testSulfuras() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Sulfuras", 0, 80));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Sulfuras"));
		assertThat(items.get(0).getQuality(), equalTo(80));
		assertThat(items.get(0).getSellIn(), equalTo(0));
	}

	@Test
	public void testBackStagePasses() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Backstage Passes", 15, 20));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Backstage Passes"));
		assertThat(items.get(0).getQuality(), equalTo(21));
		assertThat(items.get(0).getSellIn(), equalTo(14));
	}

	@Test
	public void testGingerCake() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Ginger Cake", 3, 6));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Ginger Cake"));
		assertThat(items.get(0).getQuality(), equalTo(5));
		assertThat(items.get(0).getSellIn(), equalTo(2));
	}

	@Test
	public void testAllItemsInTheSameList() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Thermal Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Chicken", 5, 7));
		items.add(new Item("Sulfuras", 0, 80));
		items.add(new Item("Backstage Passes", 15, 20));
		items.add(new Item("Ginger Cake", 3, 6));

		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		Item itemThermalVest = items.get(0);
		assertThat(itemThermalVest.getName(), equalTo("Thermal Vest"));
		assertThat(itemThermalVest.getQuality(), equalTo(19));
		assertThat(itemThermalVest.getSellIn(), equalTo(9));

		Item itemAgedBrie = items.get(1);
		assertThat(itemAgedBrie.getName(), equalTo("Aged Brie"));
		assertThat(itemAgedBrie.getQuality(), equalTo(1));
		assertThat(itemAgedBrie.getSellIn(), equalTo(1));

		Item itemChicken = items.get(2);
		assertThat(itemChicken.getName(), equalTo("Chicken"));
		assertThat(itemChicken.getQuality(), equalTo(6));
		assertThat(itemChicken.getSellIn(), equalTo(4));

		Item itemSulfuras = items.get(3);
		assertThat(itemSulfuras.getName(), equalTo("Sulfuras"));
		assertThat(itemSulfuras.getQuality(), equalTo(80));
		assertThat(itemSulfuras.getSellIn(), equalTo(0));

		Item itemBackStagePasses = items.get(4);
		assertThat(itemBackStagePasses.getName(), equalTo("Backstage Passes"));
		assertThat(itemBackStagePasses.getQuality(), equalTo(21));
		assertThat(itemBackStagePasses.getSellIn(), equalTo(14));

		Item itemGingerCake = items.get(5);
		assertThat(itemGingerCake.getName(), equalTo("Ginger Cake"));
		assertThat(itemGingerCake.getQuality(), equalTo(5));
		assertThat(itemGingerCake.getSellIn(), equalTo(2));


	}

}
