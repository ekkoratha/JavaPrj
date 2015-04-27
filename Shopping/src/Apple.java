
public class Apple implements Item {
	private static final int ITEM_PRICE = 35;
	
	@Override
	public long cost(int itemsCount) {
		return ITEM_PRICE * itemsCount;
	}
	
	@Override
	public String toString(){
		return "Apple";
	}

	@Override
	public boolean hasOffers() {
		return false;
	}

}
