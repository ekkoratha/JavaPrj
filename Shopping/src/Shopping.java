import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class Shopping {

	public enum shoppingItem{Apples,Bananas,Melons,Limes, Empty}

	private static final int FINISHED_SHOPPING = 5;
	private static Map<shoppingItem,Integer> shoppingBasket = new HashMap<shoppingItem,Integer>();
	public static void main(String[] args) {
		
		// choice loops till shopper has finished shopping
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("\nShopping Basket");
			System.out.println("\n1. Apples");
			System.out.println("2. Bananas");
			System.out.println("3. Melons");
			System.out.println("4. Limes");
			System.out.println("5. Finished Shopping");
			System.out.println("\nEnter your item (1..4) or if finished shopping enter 5");
			choice= sc.nextInt();
			if (choice>=1 && choice<FINISHED_SHOPPING){
				shoppingItem[] sItems = shoppingItem.values();
				Integer itemsCount = new Integer(1);
				if (shoppingBasket.containsKey(sItems[choice-1])){
					// already had similar items and its been scanned then add it
					Integer existingItemCount= shoppingBasket.get(sItems[choice-1]);
					itemsCount +=existingItemCount;
				}
				shoppingBasket.put(sItems[choice-1],itemsCount);
			}
		}while(choice!=FINISHED_SHOPPING);
		
		Shopping shopping= new Shopping();
		long totalCost= shopping.calcTotalCostAndDisplayBill();
		System.out.println("Total cost : £"+(totalCost/100) + "."+ (totalCost%100) + "p");
		System.out.println("\nThanks for Shopping...");
		// also show the shopper if the item has any offers
	}

	/**
	 * calculate the total cost of all the items in the basket
	 * and also Display items and costs and any offers..
	 * 
	 * @return totalCost of the items
	 */
	public long calcTotalCostAndDisplayBill(){
		long totalCost = 0;
		// loop through all the items
		Set<Entry<shoppingItem, Integer>> eSet = shoppingBasket.entrySet();
		for (Entry<shoppingItem, Integer> entry:eSet){
			shoppingItem shoppingItems = entry.getKey();
			Integer itemsCount = entry.getValue();
			System.out.print(shoppingItems.toString()+"      " + itemsCount.toString());
			long cost = calcCost(shoppingItems, itemsCount);
			
			totalCost+= cost;
		}
		return totalCost;
	}
	/**
	 * calculates cost for 1 item
	 * 
	 * @param shoppingItems
	 * @param itemsCount
	 * @return
	 */
	public long calcCost(shoppingItem shoppingItems, int itemsCount) {
		Item item = ItemFactory.createItem(shoppingItems);

		long cost = item.cost(itemsCount);
		if (item.hasOffers()){
			System.out.print(" * on OFFER * ");
		}
		System.out.println("    : £"+(cost/100) + "."+ (cost%100) + "p");
		return cost;
	}
}
