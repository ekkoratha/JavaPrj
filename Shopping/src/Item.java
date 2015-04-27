
public interface Item {
	/**
	 * This method will return the cost of the item depending on 
	 * the itemsCount and if this item has any offers (BOGOF or 3 for 2)
	 * @param itemsCount - number of similar items
	 * @return the total cost of this item in the basket.
	 */
	long cost(int itemsCount);
	
	/**
	 * If the selected shopping item has any offer then this method return true
	 * 
	 * @return true if item has offers eg: Buy-One-Get-One-Offer
	 */
	boolean hasOffers();
}
