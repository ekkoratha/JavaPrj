
public class Lime implements Item {
	private static final int ITEM_PRICE = 15;
	@Override
	public long cost(int itemsCount) {
		int adjustCount = adjustItemsCount(itemsCount);
		return ITEM_PRICE*adjustCount;
	}
	
	@Override
	public String toString(){
		return "Lime";
	}
	
	private int adjustItemsCount(int itemsCount){
		return (((itemsCount/3)*2) +itemsCount%3);
	}

	@Override
	public boolean hasOffers() {
		return true;
	}

}