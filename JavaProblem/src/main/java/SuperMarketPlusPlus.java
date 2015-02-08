import java.util.List;


public class SuperMarketPlusPlus {

    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            if ((!"Aged Brie".equals(item.getName())) && !"Backstage Passes".equals(item.getName())) {
                if (item.getQuality() > 0) {
                    if (!"Organic Bananas".equals(item.getName())) {
                        if (!"Sulfuras".equals(item.getName())) {
                            item.setQuality(item.getQuality() - 1);
                        }
                    } else {
                        item.setQuality(item.getQuality() - 2);
                    }
                }
            } else {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);

                    if ("Backstage Passes".equals(item.getName())) {
                        if (item.getSellIn() < 11) {
                            if (item.getQuality() < 50) {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }

                        if (item.getSellIn() < 6) {
                            if (item.getQuality() < 50) {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (!"Sulfuras".equals(item.getName())) {
                item.setSellIn(item.getSellIn() - 1);
            }

            if (item.getSellIn() < 0) {
                if (!"Aged Brie".equals(item.getName())) {
                    if (!"Backstage Passes".equals(item.getName())) {
                        if (item.getQuality() > 0) {
                            if (!"Sulfuras".equals(item.getName())) {
                                item.setQuality(item.getQuality() - 1);
                            }
                        }
                    } else {
                        item.setQuality(0);
                    }
                } else {
                    if (item.getQuality() < 50) {
                        item.setQuality(item.getQuality() + 1);
                    }
                }
            }
        }
    }

}