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

		Item thermalVest = items.get(0);
		assertThat(thermalVest.getName(), equalTo("Thermal Vest"));
		assertThat(thermalVest.getQuality(), equalTo(19));
		assertThat(thermalVest.getSellIn(), equalTo(9));
	}

	@Test
	public void testAgedBrie() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Aged Brie", 2, 0));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		Item agedBrie = items.get(0);
		assertThat(agedBrie.getName(), equalTo("Aged Brie"));
		assertThat(agedBrie.getQuality(), equalTo(1));
		assertThat(agedBrie.getSellIn(), equalTo(1));
	}

	@Test
	public void testChicken() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Chicken", 5, 7));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		Item chicken = items.get(0);
		assertThat(chicken.getName(), equalTo("Chicken"));
		assertThat(chicken.getQuality(), equalTo(6));
		assertThat(chicken.getSellIn(), equalTo(4));
	}

	@Test
	public void testSulfuras() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Sulfuras", 0, 80));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		Item sulfuras = items.get(0);
		assertThat(sulfuras.getName(), equalTo("Sulfuras"));
		assertThat(sulfuras.getQuality(), equalTo(80));
		assertThat(sulfuras.getSellIn(), equalTo(0));
	}

	@Test
	public void testBackStagePasses() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Backstage Passes", 15, 20));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		Item backstagePasses = items.get(0);
		assertThat(backstagePasses.getName(), equalTo("Backstage Passes"));
		assertThat(backstagePasses.getQuality(), equalTo(21));
		assertThat(backstagePasses.getSellIn(), equalTo(14));
	}

	@Test
	public void testGingerCake() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Ginger Cake", 3, 6));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		Item gingerCake = items.get(0);
		assertThat(gingerCake.getName(), equalTo("Ginger Cake"));
		assertThat(gingerCake.getQuality(), equalTo(5));
		assertThat(gingerCake.getSellIn(), equalTo(2));
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

	@Test
	public void testQualityAfterSellByDateDecrementeTwiceAsFast() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Chicken", 1, 4));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);


		Item chicken = items.get(0);
		assertThat(chicken.getName(), equalTo("Chicken"));
		assertThat(chicken.getQuality(), equalTo(0));
		assertThat(chicken.getSellIn(), equalTo(-5));
	}

	@Test
	public void testAgedBrieIncreaseInQualityAsItGetsOlder() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Aged Brie", 1, 4));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);

		Item chicken = items.get(0);
		assertThat(chicken.getName(), equalTo("Aged Brie"));
		assertThat(chicken.getQuality(), equalTo(9));
		assertThat(chicken.getSellIn(), equalTo(-2));
	}

	@Test
	public void testSulfursQualityNeverChanges() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Sulfuras", 1, 4));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);

		Item chicken = items.get(0);
		assertThat(chicken.getName(), equalTo("Sulfuras"));
		assertThat(chicken.getQuality(), equalTo(4));
		assertThat(chicken.getSellIn(), equalTo(1));
	}

	@Test
	public void testBackStagePassesLessThanTenDayButMoreThanFive() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Backstage Passes", 9, 10));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);

		Item backstagePasses = items.get(0);
		assertThat(backstagePasses.getName(), equalTo("Backstage Passes"));
		assertThat(backstagePasses.getQuality(), equalTo(16));
		assertThat(backstagePasses.getSellIn(), equalTo(6));
	}

	@Test
	public void testBackStagePassesLessThanFiveDays() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Backstage Passes", 4, 10));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);

		Item backstagePasses = items.get(0);
		assertThat(backstagePasses.getName(), equalTo("Backstage Passes"));
		assertThat(backstagePasses.getQuality(), equalTo(19));
		assertThat(backstagePasses.getSellIn(), equalTo(1));
	}

	@Test
	public void testOrganicBananasDecreseTwiceAsFast() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Organic Bananas", 4, 10));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);

		Item backstagePasses = items.get(0);
		assertThat(backstagePasses.getName(), equalTo("Organic Bananas"));
		assertThat(backstagePasses.getQuality(), equalTo(4));
		assertThat(backstagePasses.getSellIn(), equalTo(1));
	}


	@Test
	public void testOrganicBananasDecreseTwiceAsFastAfterSellInDateLessThanZero() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Organic Bananas", 0, 20));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);
		superMarketPlusPlus.updateQuality(items);

		Item backstagePasses = items.get(0);
		assertThat(backstagePasses.getName(), equalTo("Organic Bananas"));
		assertThat(backstagePasses.getQuality(), equalTo(8));
		assertThat(backstagePasses.getSellIn(), equalTo(-3));
	}



}
