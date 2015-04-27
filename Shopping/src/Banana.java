
public class Banana implements Item {

	private static final int ITEM_PRICE = 20;

	@Override
	public long cost(int itemsCount) {		
		return ITEM_PRICE * itemsCount;
	}
	
	@Override
	public String toString(){
		return "Banana";
	}

	@Override
	public boolean hasOffers() {
		return false;
	}

}
