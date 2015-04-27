public class EmptyItem implements Item {

	private static final int ITEM_PRICE = 0;
	
	@Override
	public long cost(int itemsCount) {
		return ITEM_PRICE*itemsCount;
	}
	
	@Override
	public String toString(){
		return "";
	}

	@Override
	public boolean hasOffers() {
		return false;
	}

}