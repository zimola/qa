package anotherex;

import java.util.ArrayList;

public class DatabaseMock {
	
	ArrayList<Dealer> dealers;
	ArrayList<OrderItems> items;
	ArrayList<DeliveryAddress> addresses;
	ArrayList<Item> singleItems;
	ArrayList<Order> order;
	
	public DatabaseMock() {
		super();
		dealers = new ArrayList<>();
		items = new ArrayList<>();
		addresses = new ArrayList<>();
		singleItems = new ArrayList<>();
		order = new ArrayList<>();
		
		
		//Mock Items
		Item item1 = new Item(12345,2);
		Item item2 = new Item(34567,4);
		Item item3 = new Item(34457,2);
		Item item4 = new Item(1111,1111);
		Item item5 = new Item(2222,2222);
		Item item6 = new Item(-5, -4);
		
		ArrayList<Item> itemList1 = new ArrayList<>();
		ArrayList<Item> itemList2 = new ArrayList<>();
		ArrayList<Item> itemList3 = new ArrayList<>();//with bad items
		
		itemList1.add(item1);
		itemList1.add(item2);
		itemList2.add(item2);
		itemList2.add(item3);
		
		//Mock Dealers
		Dealer dealer1 = new Dealer("XXX-1234-ABCD-1234", "kkklas8882kk23nllfjj88290");
		Dealer dealer2 = new Dealer("XXX-1234-ABCD-1234", "kkklas8882kk23nllfjj88290");
		Dealer dealer3 = new Dealer(null, null);
		Dealer dealer4 = new Dealer("XXX-1234-ABCD-1234", null);
		Dealer dealer5 = new Dealer(null, "kkklas8882kk23nllfjj88290");
		
		//Mock Order Items
		OrderItems items1 = new OrderItems(itemList1);
		OrderItems items2 = new OrderItems(itemList2);
		
		//Mock addresses
		DeliveryAddress address1 = new DeliveryAddress("Matt", "StreetName", "CityName", "Province", "Postal");
		DeliveryAddress address2 = new DeliveryAddress("Matt2", "StreetName2", "CityName2", "Province2", "Postal2");
		
		//Mock Orders
		Order order1 = new Order(dealer1, items1, address1);
		Order order2 = new Order(dealer2, items2, address2);
		Order order3 = new Order(dealer3, items1, address1);//bad dealer
		Order order4 = new Order(dealer4, items1, address1);//bad dealer
		Order order5 = new Order(dealer5, items1, address1);//bad dealer
		//Order order3 = new Order(dealer3)
		//Add to instance Variables
		dealers.add(dealer1);
		dealers.add(dealer2);
		items.add(items1);
		items.add(items2);
		addresses.add(address1);
		addresses.add(address2);
		singleItems.add(item1);
		singleItems.add(item2);
		order.add(order1);
		order.add(order2);
		order.add(order3);
		order.add(order4);
		order.add(order5);
		
		
		}


	}


