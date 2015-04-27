
public class Melon implements Item {
	private static final int ITEM_PRICE = 50;
	
	@Override
	public long cost(int itemsCount) {
		int adjustItemsCount = adjustItemsCount(itemsCount);
		
		return ITEM_PRICE*adjustItemsCount;
	}

	public boolean hasOffers(){
		return true;
	}
	/**
	 * since this item has Buy-One-Get-One-Offer
	 * if user pick 1 item then item count is 1
	 * if user picks 2 items then item count should be 1
	 * if user picks 3 items then item count should be 2
	 * 
	 * @param itemsCount actual number of items in the basket
	 * @return adjusted or updated item count depending on the offer
	 */
	private int adjustItemsCount(int itemsCount) {
		int itemCount = itemsCount/2+itemsCount%2;
		return itemCount;
	}
	
	@Override
	public String toString(){
		return "Melon";
	}

}