import static org.junit.Assert.*;

import org.junit.Test;


public class ShoppingTest {
	
	/**
	 * GIVEN Shopper has empty basket
	 * WHEN calcCost is invoked
	 * THEN the result is 0p
	 */
	@Test
	public void testCostOfEmptyBasket() {
		//given
		long expected = 0;
		Shopping sut = new Shopping();
		int itemCount = 0;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Empty, itemCount );
		
		//then
		assertEquals(expected, actual);
	}

	/**
	 * GIVEN Shopper has picked item I1
	 * AND I1 is Apple
	 * WHEN calcCost is invoked
	 * THEN the result is 35p
	 */
	@Test
	public void testCostOfOneApple() {
		//given
		long expected = 35;
		Shopping sut = new Shopping();
		int itemCount = 1;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Apples,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item appleItem = ItemFactory.createItem(Shopping.shoppingItem.Apples);
		assertEquals(actual,appleItem.cost(itemCount));
	}

	/**
	 * GIVEN Shopper has picked 2 I1 items
	 * AND I1 is Apple
	 * WHEN calcCost is invoked
	 * THEN the result is 35p * 2 = 70p
	 */
	@Test
	public void testCostOfTwoApple() {
		//given
		long expected = 70;
		Shopping sut = new Shopping();
		int itemCount = 2;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Apples,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item appleItem = ItemFactory.createItem(Shopping.shoppingItem.Apples);
		assertEquals(actual,appleItem.cost(itemCount));
	}
	/**
	 * GIVEN Shopper has picked 3 I1 items
	 * AND I1 is Apple
	 * WHEN calcCost is invoked
	 * THEN the result is 35p * 3 = £1 and 5p
	 */
	@Test
	public void testCostOfThreeApple() {
		//given
		long expected = 105;
		Shopping sut = new Shopping();
		int itemCount = 3;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Apples,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item appleItem = ItemFactory.createItem(Shopping.shoppingItem.Apples);
		assertEquals(actual,appleItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked item I1
	 * AND I1 is Banana
	 * WHEN calcCost is invoked
	 * THEN the result is 20p
	 */
	@Test
	public void testCostOfOneBanana() {
		//given
		long expected = 20;
		Shopping sut = new Shopping();
		int itemCount = 1;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Bananas,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item bananaItem = ItemFactory.createItem(Shopping.shoppingItem.Bananas);
		assertEquals(actual,bananaItem.cost(itemCount));
	}

	/**
	 * GIVEN Shopper has picked 2 I1 items
	 * AND I1 is Banana
	 * WHEN calcCost is invoked
	 * THEN the result is 20p * 2 = 40p
	 */
	@Test
	public void testCostOfTwoBanana() {
		//given
		long expected = 40;
		Shopping sut = new Shopping();
		int itemCount = 2;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Bananas,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item bananaItem = ItemFactory.createItem(Shopping.shoppingItem.Bananas);
		assertEquals(actual,bananaItem.cost(itemCount));
	}

	/**
	 * GIVEN Shopper has picked 3 I1 items
	 * AND I1 is Banana
	 * WHEN calcCost is invoked
	 * THEN the result is 20p * 3 = 40p
	 */
	@Test
	public void testCostOfThreeBanana() {
		//given
		long expected = 60;
		Shopping sut = new Shopping();
		int itemCount = 3;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Bananas,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item bananaItem = ItemFactory.createItem(Shopping.shoppingItem.Bananas);
		assertEquals(actual,bananaItem.cost(itemCount));
	}
		
	/**
	 * GIVEN Shopper has picked item I1
	 * AND I1 is Melon
	 * WHEN calcCost is invoked
	 * THEN the result is 50p
	 */
	@Test
	public void testCostOfOneMelon() {
		//given
		long expected = 50;
		Shopping sut = new Shopping();
		int itemCount = 1;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Melons,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item melonItem = ItemFactory.createItem(Shopping.shoppingItem.Melons);
		assertEquals(actual,melonItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked 2 I1 items 
	 * AND I1 is Melon
	 * WHEN calcCost is invoked
	 * THEN the result is 50p * 2 = £1
	 * AND since Melon are on Offer BOGOF it only costs 50p
	 */
	@Test
	public void testCostOfTwoMelon() {
		//given
		long expected = 50;
		Shopping sut = new Shopping();
		int itemCount = 2;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Melons,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item melonItem = ItemFactory.createItem(Shopping.shoppingItem.Melons);
		assertEquals(actual,melonItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked 3 I1 items 
	 * AND I1 is Melon
	 * WHEN calcCost is invoked
	 * THEN the result is 50p * 3 = £1 & 50p
	 * AND since Melon are on Offer BOGOF it only costs £1
	 */
	@Test
	public void testCostOfThreeMelon() {
		//given
		long expected = 100;
		Shopping sut = new Shopping();
		int itemCount = 3;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Melons,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item melonItem = ItemFactory.createItem(Shopping.shoppingItem.Melons);
		assertEquals(actual,melonItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked 4 I1 items 
	 * AND I1 is Melon
	 * WHEN calcCost is invoked
	 * THEN the result is 50p * 4 = £2
	 * AND since Melon are on Offer BOGOF it only costs £1
	 */
	@Test
	public void testCostOfFourMelon() {
		//given
		long expected = 100;
		Shopping sut = new Shopping();
		int itemCount = 4;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Melons,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item melonItem = ItemFactory.createItem(Shopping.shoppingItem.Melons);
		assertEquals(actual,melonItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked 5 I1 items 
	 * AND I1 is Melon
	 * WHEN calcCost is invoked
	 * THEN the result is 50p * 5 = £2 and 50p
	 * AND since Melon are on Offer BOGOF it only costs £1 & 50p
	 */
	@Test
	public void testCostOfFiveMelon() {
		//given
		long expected = 150;
		Shopping sut = new Shopping();
		int itemCount = 5;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Melons,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item melonItem = ItemFactory.createItem(Shopping.shoppingItem.Melons);
		assertEquals(actual,melonItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked item I1
	 * AND I1 is Lime
	 * WHEN calcCost is invoked
	 * THEN the result is 15p
	 */
	@Test
	public void testCostOfOneLime() {
		//given
		long expected = 15;
		Shopping sut = new Shopping();
		int itemCount = 1;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Limes,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item limeItem = ItemFactory.createItem(Shopping.shoppingItem.Limes);
		assertEquals(actual,limeItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked 2 I1 items
	 * AND I1 is Lime
	 * WHEN calcCost is invoked
	 * THEN the result is 15p + 15p
	 */
	@Test
	public void testCostOfTwoLime() {
		//given
		long expected = 30;
		Shopping sut = new Shopping();
		int itemCount = 2;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Limes,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item limeItem = ItemFactory.createItem(Shopping.shoppingItem.Limes);
		assertEquals(actual,limeItem.cost(itemCount));
	}
	/**
	 * GIVEN Shopper has picked 3 I1 items
	 * AND I1 is Lime
	 * WHEN calcCost is invoked
	 * THEN the result is 15p + 15p + 15p
	 * AND I1 is on ‘three for the price two’ offer
	 */
	@Test
	public void testCostOfThreeLime() {
		//given
		long expected = 30;
		Shopping sut = new Shopping();
		int itemCount = 3;

		//when
		long actual = sut.calcCost(Shopping.shoppingItem.Limes,itemCount );
		
		//then
		assertEquals(expected, actual);
		Item limeItem = ItemFactory.createItem(Shopping.shoppingItem.Limes);
		assertEquals(actual,limeItem.cost(itemCount));
	}
	
	/**
	 * GIVEN Shopper has picked N I1 items
	 * AND I1 is Lime
	 * WHEN calcCost is invoked
	 * THEN the result depends 
	 *  if 0 items - 0p
	 *  if 1 item -  15p
	 *  if 2 items - 30p
	 *  if 3 items - 30p
	 *  if 4 items - 45p
	 *  if 5 items - 60p
	 *  if 6 items - 60p
	 *  if 7 items - 75p
	 *  if 8 items - 90p
	 *  if 9 items - 90p
	 * AND I1 is on ‘three for the price two’ offer
	 */
	@Test
	public void testCostOfNLime() {
		//given
		long expected[]={0,15,30,30,45,60,60,75,90,90};
		
		Shopping sut = new Shopping();

		//when
		for (int itemCount=0;itemCount<expected.length;itemCount++)
		{
		long actual = sut.calcCost(Shopping.shoppingItem.Limes,itemCount );
		
		//then
		assertEquals(expected[itemCount], actual);
		Item limeItem = ItemFactory.createItem(Shopping.shoppingItem.Limes);
		assertEquals(actual,limeItem.cost(itemCount));
		}
	}
}
