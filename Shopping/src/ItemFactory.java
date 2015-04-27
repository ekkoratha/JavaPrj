public class ItemFactory {

	public static Item createItem(Shopping.shoppingItem shoppingItem) {
		Item item=null;
		switch(shoppingItem){
		case Apples:
			item = new Apple();
			break;
		case Bananas:
			item = new Banana();
			break;
		case Melons:
			item = new Melon();
			break;
		case Limes:
			item = new Lime();
			break;
		case Empty:
			item = new EmptyItem();
		default: 
			// log the error or throw exception 
			assert(false);
		}
		return item;
	}
}
