import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class SuperMarketPlusPlusTest {

	@Test
	public void testTheTruth() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("Thermal Vest", 10, 20));
		SuperMarketPlusPlus superMarketPlusPlus = new SuperMarketPlusPlus();
		superMarketPlusPlus.updateQuality(items);

		assertThat(items.get(0).getName(), equalTo("Thermal Vest"));
		assertThat(items.get(0).getQuality(), equalTo(19));
		assertThat(items.get(0).getSellIn(), equalTo(9));

	}
}
